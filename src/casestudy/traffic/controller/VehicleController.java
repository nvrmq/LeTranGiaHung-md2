package casestudy.traffic.controller;

import casestudy.traffic.services.VehicelService;
import casestudy.traffic.view.VehicleView;

import java.util.Scanner;

public class VehicleController {
    private VehicelService vehicelService;
    private VehicleView vehicleView;
    private Scanner scanner;
    public VehicleController() {
        vehicleView = new VehicleView();
        scanner = new Scanner(System.in);
        vehicelService = new VehicelService(vehicleView);
    }
    public void start() {
        boolean running = true;

        while (running) {
            vehicleView.display();
            try {
                int choice = vehicleView.getChoice();
                switch (choice) {
                    case 1:
                        vehicelService.addVehicle();
                        break;
                    case 2:
                        vehicelService.deleteVehicle();
                        break;
                    case 3:
                        vehicelService.displayAllVehicles();
                        break;
                    case 4:
                        running = false;
                        vehicleView.printMessage("Exit Program");
                        break;
                    default:
                        vehicleView.printMessage("Invalid choice");
                        break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
