package TrafficManagement.controller;

import TrafficManagement.entity.Car;
import TrafficManagement.entity.Motorbike;
import TrafficManagement.entity.Truck;
import TrafficManagement.service.ImplCarService;
import TrafficManagement.service.ImplMotobikeService;
import TrafficManagement.service.ImplTruckService;

import java.util.Scanner;

public class VehicleController {
    ImplCarService implCarService=new ImplCarService();
    ImplMotobikeService implMotobikeService=new ImplMotobikeService();
    ImplTruckService implTruckService=new ImplTruckService();
    Scanner scanner=new Scanner(System.in);
    public void showMenu(){
        while (true){
            System.out.println("1. Add Vehicle");
            System.out.println("2. Display Vehicles");
            System.out.println("3. Delete Vehicle");
            System.out.println("4. Exit");
            System.out.println("Choose option: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    addNewVehicle();
                    break;
                case 2:
                    displayVehicles();
                    break;
                case 3:
                    deleteVehicles();
                    break;
            }
        }
    }
    public void addNewVehicle(){
        System.out.println("1. Add Truck");
        System.out.println("2. Add Car");
        System.out.println("3. Add Motorbike");
        System.out.print("Choose vehicle type: ");
        int type=Integer.parseInt(scanner.nextLine());

        System.out.println("Enter id vehicle: ");
        String idVehicle=scanner.nextLine();
        System.out.println("Enter brand: ");
        String brand=scanner.nextLine();
        System.out.println("Enter year of Manufacture: ");
        int year=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter owner: ");
        String owner=scanner.nextLine();
        switch (type){
            case 1:
                System.out.println("Enter load capacity: ");
                int loadCapacity=Integer.parseInt(scanner.nextLine());
                implTruckService.addTruck(new Truck(idVehicle,brand,year,owner,loadCapacity));
                System.out.println("Added successfully");
                break;
            case 2:
                System.out.println("Enter seat count: ");
                int seatCount=Integer.parseInt(scanner.nextLine());
                System.out.println("Enter car type: ");
                String carType=scanner.nextLine();
                implCarService.addCar(new Car(idVehicle,brand,year,owner,seatCount,carType));
                System.out.println("Added successfully");
                break;
            case 3:
                System.out.println("Enter power: ");
                int power=Integer.parseInt(scanner.nextLine());
                implMotobikeService.addMotobike(new Motorbike(idVehicle,brand,year,owner,power));
                System.out.println("Added successfully");
                break;
            default:
                System.out.println("Invalid vehicle type.");
        }
    }
    public void displayVehicles(){
        System.out.println("1. Display Trucks");
        System.out.println("2. Display Cars");
        System.out.println("3. Display Motorbikes");
        System.out.print("Choose vehicle type: ");
        int type=Integer.parseInt(scanner.nextLine());
        switch (type){
            case 1 :
                implTruckService.displayTruck();
                break;
            case 2:
                implCarService.displayCar();
                break;
            case 3:
                implMotobikeService.displayTruck();
                break;
            default:
                System.out.println("Invalid vehicle type.");
        }
    }
    public void deleteVehicles(){
        System.out.println("Enter id vehicle you want delete: ");
        String idVehicle=scanner.nextLine();
        System.out.println("Are sure to delete this id vehicle (Yes/No): ");
        String confirm=scanner.nextLine();
        if (confirm.equalsIgnoreCase("Yes")){
            implTruckService.deleteIdTruck(idVehicle);
            implCarService.deleteIdCar(idVehicle);
            implMotobikeService.deleteIdTruck(idVehicle);
            System.out.println("Vehicle deleted successfully !!!");
        }
    }
}
