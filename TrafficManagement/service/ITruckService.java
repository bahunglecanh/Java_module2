package TrafficManagement.service;

import TrafficManagement.entity.Car;
import TrafficManagement.entity.Truck;

public interface ITruckService {
    void addTruck(Truck truck);
    void displayTruck();
    void deleteIdTruck(String idTruck);
}
