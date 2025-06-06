package TrafficManagement.service;

import TrafficManagement.entity.Motorbike;

public interface IMotobikeService{
    void addMotobike(Motorbike motorbike);
    void displayTruck();
    void deleteIdTruck(String idMotobike);
}
