package TrafficManagement.service;

import TrafficManagement.entity.Car;
import TrafficManagement.repository.VehicleRepository;

import java.util.ArrayList;

public class ImplCarService implements ICarService{
    @Override
    public void addCar(Car car) {
        VehicleRepository.appendVehicleToFile(car);
    }

    @Override
    public void displayCar() {
        ArrayList<Car> cars = VehicleRepository.readCarsFromFile();
        for (Car car : cars) {
            car.displayDetails();
        }
    }

    @Override
    public void deleteIdCar(String idCar) {
        VehicleRepository.removeVehicleByIdFromFile(idCar);
    }
}
