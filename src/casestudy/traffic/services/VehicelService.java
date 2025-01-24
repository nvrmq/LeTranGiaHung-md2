package casestudy.traffic.services;

import casestudy.traffic.models.Cars;
import casestudy.traffic.models.Truck;
import casestudy.traffic.models.Motocycle;
import casestudy.traffic.models.Vehicle;
import casestudy.traffic.utils.FileExcutor;
import casestudy.traffic.view.VehicleView;

import java.util.ArrayList;
import java.util.List;

public class VehicelService {
    private final VehicleView view;
    private final List<Vehicle> vehicles = new ArrayList<>();
    public VehicelService(VehicleView view) {
        this.view = view;
    }

    public void addVehicle(){
        view.printMessage("1.Add car");
        view.printMessage("2.Add truck");
        view.printMessage("3.Add motocycle");
        try {
            int choice = Integer.parseInt(view.getInput("Choose Vehicle Type:"));
            String licensePlate = view.getInput("Enter license plate");
            if (isDuplicate(licensePlate)) {
                view.printMessage("License plate already exists");
                return;
            }
            List<String> manufacturers = FileExcutor.readFile("manufacturer.csv");
            if (manufacturers.isEmpty()) {
                view.printMessage("No manufacturers found");
                return;
            }
            view.printMessage("Manufacturers:");
            for(int i = 0; i < manufacturers.size(); i++){
                view.printMessage((i+1) + ". " + manufacturers.get(i));
            }
            int manufacturerChoice = Integer.parseInt(view.getInput("Choose Manufacturer:"));
            if (manufacturerChoice < 1 || manufacturerChoice > manufacturers.size()) {
                view.printMessage("Invalid Manufacturer");
                return;
            }
            String manufacturer = manufacturers.get(manufacturerChoice - 1).split(",")[1];

            int productionYear = Integer.parseInt(view.getInput("Enter production year"));
            if(productionYear < 1900 || productionYear > 2025){
                view.printMessage("Invalid production year");
                return;
            }
            String ownerName = view.getInput("Enter owner name");
            Vehicle vehicle = null;
            switch (choice) {
                case 1:
                    String carType = view.getInput("Enter car type: ");
                    int seats = Integer.parseInt(view.getInput("Enter seats: "));
                    vehicle = new Cars(licensePlate, manufacturer, productionYear, ownerName, carType, seats);
                    FileExcutor.writeFile("cars.csv", vehicle.toString());
                    break;
                case 2:
                    double payload = Double.parseDouble(view.getInput("Enter weight: "));
                    vehicle = new Truck(licensePlate, manufacturer, productionYear, ownerName, payload);
                    FileExcutor.writeFile("trucks.csv", vehicle.toString());
                    break;
                case 3:
                    int engineCapacity = Integer.parseInt(view.getInput("Enter capacity: "));
                    vehicle = new Motocycle(licensePlate, manufacturer, productionYear, ownerName, engineCapacity);
                    FileExcutor.writeFile("motocycles.csv", vehicle.toString());
                    break;
                default:
                    view.printMessage("Invalid choice");
            }

            vehicles.add(vehicle);
            System.out.print("Vehicle added");
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
    private boolean isDuplicate(String licensePlate){
        for (Vehicle vehicle: vehicles){
            if (vehicle.getLicensePlate().equals(licensePlate)){
                return true;
            }
        }
        return false;
    }
    public void deleteVehicle(){
        try {
            view.printMessage("1. Delete cars");
            view.printMessage("2. Delete trucks");
            view.printMessage("3. Delete motocycles");
            int choice = Integer.parseInt(view.getInput("Choose Vehicle Type:"));

            String fileName;
            switch (choice) {
                case 1:
                    fileName = "cars.csv";
                    break;
                case 2:
                    fileName = "trucks.csv";
                    break;
                case 3:
                    fileName = "motocycles.csv";
                    break;
                default:
                    view.printMessage("Invalid choice");
                    return;
            }
            String regex = "^[0-9]{2}[A-Z]-[0-9]{3}\\.[0-9]{2}$";
            String licensePlate = view.getInput("Enter license plate to delete: ");

            if (licensePlate.matches(regex)) {
                view.printMessage("License plate: " + licensePlate + " not correct");
                return;
            }
            List<String> vehicles = FileExcutor.readFile(fileName);
            boolean found = false;

            for (String line : vehicles) {
                if (line.startsWith(licensePlate)) {
                    String confirmation = view.getInput("Are you sure(Yes/No): ");
                    if (confirmation.equalsIgnoreCase("Yes")) {
                        vehicles.remove(line);
                        FileExcutor.overwriteFile(fileName, vehicles);
                        view.printMessage("Done");
                    } else {
                        view.printMessage("Cancelled");
                    }
                    found = true;
                    break;
                }
            }
            if (!found) {
                view.printMessage("No vehicle with licenplate: " + licensePlate);
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
    public void displayAllVehicles(){
        view.printMessage("1. Show all cars");
        view.printMessage("2. Show all trucks");
        view.printMessage("3. Show all motocycles");

        try {
            int choice = Integer.parseInt(view.getInput("Choose Vehicle Type:"));

            List<String> data;
            switch (choice) {
                case 1:
                    data = FileExcutor.readFile("cars.csv");
                    break;
                case 2:
                    data = FileExcutor.readFile("trucks.csv");
                    break;
                case 3:
                    data = FileExcutor.readFile("motocycles.csv");
                    break;
                default:
                    view.printMessage("Invalid choice");
                    return;
            }
            if (data.isEmpty()) {
                view.printMessage("No vehicles found");
            } else {
                data.forEach(System.out::println);
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
