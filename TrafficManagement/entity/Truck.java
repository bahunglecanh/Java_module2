package TrafficManagement.entity;

public class Truck extends Vehicle{
    public int loadCapacity;


    public Truck(String idVehicle, String nameBrand, int yearManufature, String owner, int loadCapacity) {
        super(idVehicle, nameBrand, yearManufature, owner);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck: " + idVehicle + ", " + nameBrand + ", " + yearManufature + ", " + owner + ", Load Capacity: " + loadCapacity);
    }
}
