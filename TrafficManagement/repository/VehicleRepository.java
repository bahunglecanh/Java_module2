package TrafficManagement.repository;

import TrafficManagement.entity.Car;
import TrafficManagement.entity.Motorbike;
import TrafficManagement.entity.Truck;

import java.util.ArrayList;

public class VehicleRepository {
    public static ArrayList<Car> cars=new ArrayList<>();
    public static ArrayList<Truck> trucks=new ArrayList<>();
    public static ArrayList<Motorbike> motorbikes=new ArrayList<>();
}
