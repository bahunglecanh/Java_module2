package TrafficManagement.entity;

public class Car extends Vehicle{
    public int seatCount;
    public String carType;

    public Car(String idVehicle, String nameBrand, int yearManufature, String owner, int seatCount, String carType) {
        super(idVehicle, nameBrand, yearManufature, owner);
        this.seatCount = seatCount;
        this.carType = carType;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car: " + idVehicle + ", " + nameBrand + ", " + yearManufature + ", " + owner + ", Car Type: " + carType + ", Seats: " + seatCount);
    }
}
