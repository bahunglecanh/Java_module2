package TrafficManagement.view;

import TrafficManagement.controller.VehicleController;

public class VehicleView {
    public static void main(String[] args) {
        VehicleController vehicleController=new VehicleController();
        vehicleController.showMenu();
    }
}
