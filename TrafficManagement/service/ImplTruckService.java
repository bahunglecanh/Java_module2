package TrafficManagement.service;

import TrafficManagement.entity.Truck;
import java.util.ArrayList;

public class ImplTruckService implements ITruckService{

    @Override
    public void addTruck(Truck truck) {
        TrafficManagement.repository.VehicleRepository.appendVehicleToFile(truck);
    }

    @Override
    public void displayTruck() {
        ArrayList<Truck> trucks = TrafficManagement.repository.VehicleRepository.readTrucksFromFile();
        for (Truck truck : trucks) {
            truck.displayDetails();
        }
    }

    @Override
    public void deleteIdTruck(String idTruck) {
        TrafficManagement.repository.VehicleRepository.removeVehicleByIdFromFile(idTruck);
    }
}
