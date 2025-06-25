package TrafficManagement.service;

import TrafficManagement.entity.Motorbike;
import TrafficManagement.repository.VehicleRepository;

import java.util.ArrayList;

public class ImplMotobikeService implements IMotobikeService{
    @Override
    public void addMotobike(Motorbike motorbike) {
        VehicleRepository.appendVehicleToFile(motorbike);
    }

    @Override
    public void displayTruck() {
        ArrayList<Motorbike> motorbikes = VehicleRepository.readMotorbikesFromFile();
        for (Motorbike motorbike : motorbikes) {
            motorbike.displayDetails();
        }
    }

    @Override
    public void deleteIdTruck(String idMotobike) {
        VehicleRepository.removeVehicleByIdFromFile(idMotobike);
    }
}
