package TrafficManagement.repository;

import TrafficManagement.entity.Car;
import TrafficManagement.entity.Motorbike;
import TrafficManagement.entity.Truck;

import java.util.ArrayList;
import java.io.*;

public class VehicleRepository {
    public static ArrayList<Car> cars=new ArrayList<>();
    public static ArrayList<Truck> trucks=new ArrayList<>();
    public static ArrayList<Motorbike> motorbikes=new ArrayList<>();

    private static final String VEHICLE_FILE = "TrafficManagement/view/vehicles.txt";

    public static void appendVehicleToFile(Object vehicle) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(VEHICLE_FILE, true))) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                bw.write("CAR," + car.getIdVehicle() + "," + car.getNameBrand() + "," + car.getYearManufature() + "," + car.getOwner() + "," + car.getSeatCount() + "," + car.getCarType());
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                bw.write("TRUCK," + truck.getIdVehicle() + "," + truck.getNameBrand() + "," + truck.getYearManufature() + "," + truck.getOwner() + "," + truck.getLoadCapacity());
            } else if (vehicle instanceof Motorbike) {
                Motorbike motorbike = (Motorbike) vehicle;
                bw.write("MOTORBIKE," + motorbike.getIdVehicle() + "," + motorbike.getNameBrand() + "," + motorbike.getYearManufature() + "," + motorbike.getOwner() + "," + motorbike.getPower());
            }
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Car> readCarsFromFile() {
        ArrayList<Car> cars = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(VEHICLE_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7 && parts[0].equals("CAR")) {
                    Car car = new Car(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4], Integer.parseInt(parts[5]), parts[6]);
                    cars.add(car);
                }
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public static ArrayList<Truck> readTrucksFromFile() {
        ArrayList<Truck> trucks = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(VEHICLE_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6 && parts[0].equals("TRUCK")) {
                    Truck truck = new Truck(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4], Integer.parseInt(parts[5]));
                    trucks.add(truck);
                }
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
        return trucks;
    }

    public static ArrayList<Motorbike> readMotorbikesFromFile() {
        ArrayList<Motorbike> motorbikes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(VEHICLE_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6 && parts[0].equals("MOTORBIKE")) {
                    Motorbike motorbike = new Motorbike(parts[1], parts[2], Integer.parseInt(parts[3]), parts[4], Integer.parseInt(parts[5]));
                    motorbikes.add(motorbike);
                }
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        return motorbikes;
    }

    public static void removeVehicleByIdFromFile(String idVehicle) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(VEHICLE_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length > 1 && !parts[1].equals(idVehicle)) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(VEHICLE_FILE))) {
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
