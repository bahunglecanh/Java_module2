package TrafficManagement.service;

import TrafficManagement.entity.Motorbike;
import TrafficManagement.repository.VehicleRepository;

public class ImplMotobikeService implements IMotobikeService{
    @Override
    public void addMotobike(Motorbike motorbike) {
        VehicleRepository.motorbikes.add(motorbike);
    }

    @Override
    public void displayTruck() {
        for (Motorbike motorbike:VehicleRepository.motorbikes){
            motorbike.displayDetails();
        }
    }

    @Override
    public void deleteIdTruck(String idMotobike) {
        VehicleRepository.motorbikes.removeIf(motorbike -> motorbike.idVehicle.equals(idMotobike));
    }
}
