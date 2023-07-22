package practice.oop.task9.services;

import java.util.List;

import practice.oop.task9.models.Plane;

public interface PlaneService {
    
    void addPlane(Plane plane);

    void removePlane(Plane plane);

    // Model is not a unique identifier, thus can return multiple results
    List<Plane> findPlaneByModel(String model);
    
    // Same for seatingCapacity, though less likely to return multiple results
    List<Plane> findPlaneBySeatingCapacity(int seatingCapacity);
}
