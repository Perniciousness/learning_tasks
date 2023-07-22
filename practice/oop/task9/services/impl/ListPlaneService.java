package practice.oop.task9.services.impl;

import java.util.ArrayList;
import java.util.List;

import practice.oop.task9.models.Plane;
import practice.oop.task9.services.PlaneService;

public class ListPlaneService implements PlaneService {

    private List<Plane> planeDirectory;

    public ListPlaneService(List<Plane> planeDirectory) {
        
        this.planeDirectory = planeDirectory;
    }

    public List<Plane> getPlaneDirectory() {
        
        return planeDirectory;
    }

    @Override
    public void addPlane(Plane plane) {
        
        planeDirectory.add(plane);
    }

    @Override
    public void removePlane(Plane plane) {
        
        planeDirectory.remove(plane);
    }

    // Should be noted that I repeat the code used to find stuff, but as long as I repeat it three times or less, I don't care about DRY, because it would spit in the face of KISS.
    // Without context it sounds so bizarre lmao
    @Override
    public List<Plane> findPlaneByModel(String model) {
        
        List<Plane> resultingList = new ArrayList<>();
        for (Plane plane : planeDirectory) {
            if (plane.getModel().equalsIgnoreCase(model)) {
                resultingList.add(plane);
            }
        }
        return resultingList;
    }

    @Override
    public List<Plane> findPlaneBySeatingCapacity(int seatingCapacity) {
        
        List<Plane> resultingList = new ArrayList<>();
        for (Plane plane : planeDirectory) {
            if (plane.getSeatingCapacity() == seatingCapacity) {
                resultingList.add(plane);
            }
        }
        return resultingList;
    }
}
