package TrafficManagement.service;

import TrafficManagement.entity.Car;
import TrafficManagement.repository.VehicleRepository;

public class ImplCarService implements ICarService{
    @Override
    public void addCar(Car car) {
        VehicleRepository.cars.add(car);
    }

    @Override
    public void displayCar() {
        for (Car car:VehicleRepository.cars){
            car.displayDetails();
        }
    }

    @Override
    public void deleteIdCar(String idCar) {
        VehicleRepository.cars.removeIf(car -> car.idVehicle.equals(idCar));
    }


}
