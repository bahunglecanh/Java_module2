package TrafficManagement.service;

import TrafficManagement.entity.Truck;
import TrafficManagement.repository.VehicleRepository;

public class ImplTruckService implements ITruckService{

    @Override
    public void addTruck(Truck truck) {
        VehicleRepository.trucks.add(truck);
    }

    @Override
    public void displayTruck() {
        for (Truck truck:VehicleRepository.trucks){
            truck.displayDetails();
        }
    }

    @Override
    public void deleteIdTruck(String idTruck) {
        VehicleRepository.trucks.removeIf(truck -> truck.idVehicle.equals(idTruck));
    }
}
