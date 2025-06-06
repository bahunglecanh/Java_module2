package TrafficManagement.service;

import TrafficManagement.entity.Car;

public interface ICarService {
    void addCar(Car car);
    void displayCar();
    void deleteIdCar(String idCar);
}
