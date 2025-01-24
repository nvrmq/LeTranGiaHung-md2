package atest.service;

import atest.model.Vehicle;
import atest.uitilities.FileExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleService {
    private final List<Vehicle> vehicles = new ArrayList<>();
    private final FileExecutor fileExecutor = new FileExecutor();
    private final Scanner scanner = new Scanner(System.in);

    public VehicleService() {
    }
    public void getVehicles() {
        try {
            List<String> data = fileExecutor.readFile(car.csv);
            if (data.isEmpty()) {
                System.out.printf("No vehicles found\n");
            } else {
                data.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addVehicle(Vehicle vehicle) {
        System.out.println("Enter licensePlate: ");
        String licensePlate = scanner.nextLine();

    }
}
