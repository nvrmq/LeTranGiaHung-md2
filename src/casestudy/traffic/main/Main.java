package casestudy.traffic.main;

import casestudy.traffic.controller.VehicleController;
import casestudy.traffic.view.VehicleView;

public class Main {
    public static void main(String[] args) {
        VehicleView vehicleView = new VehicleView();
        VehicleController vehicleController = new VehicleController();

        vehicleController.start();
    }
}
