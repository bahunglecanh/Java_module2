package TrafficManagement.entity;

public class Motorbike extends Vehicle{
    public int power;

    public Motorbike(String idVehicle, String nameBrand, int yearManufature, String owner, int power) {
        super(idVehicle, nameBrand, yearManufature, owner);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void displayDetails() {
        System.out.println("Motorbike: " + idVehicle + ", " + nameBrand + ", " + yearManufature + ", " + owner + ", Power: " + power);
    }
}
