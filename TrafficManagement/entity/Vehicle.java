package TrafficManagement.entity;

public abstract class Vehicle {
    public String idVehicle;
    public String nameBrand;
    public int yearManufature;
    public String owner;

    public Vehicle() {
    }

    public Vehicle(String idVehicle, String nameBrand, int yearManufature, String owner) {
        this.idVehicle = idVehicle;
        this.nameBrand = nameBrand;
        this.yearManufature = yearManufature;
        this.owner = owner;
    }

    public String getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(String idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public int getYearManufature() {
        return yearManufature;
    }

    public void setYearManufature(int yearManufature) {
        this.yearManufature = yearManufature;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public abstract void displayDetails();
}
