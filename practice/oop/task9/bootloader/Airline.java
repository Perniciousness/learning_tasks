package practice.oop.task9.bootloader;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import practice.oop.task9.models.Flight;
import practice.oop.task9.models.Plane;
import practice.oop.task9.services.impl.ListFlightService;
import practice.oop.task9.services.impl.ListPlaneService;

public final class Airline {

    private Airline() {}

    public static void main(String[] args) {
        
        List<Flight> flightDirectory = Arrays.asList(
            new Flight
            .FlightBuilder("Istanbul", "New Delphi")
            .setDepartureTime(LocalTime.of(10, 40))
            .setArrivalTime(LocalTime.of(20, 0))
            .build(),
            new Flight
            .FlightBuilder("Dubai", "Rome")
            .setDepartureTime(LocalTime.of(6, 15))
            .setArrivalTime(LocalTime.of(8, 53))
            .build());
        List<Plane> planeDirectory = Arrays.asList(
            new Plane
            .PlaneBuilder()
            .setManufacturer("Airbus")
            .setModel("812")
            .setSeatingCapacity(408)
            .build(),
            new Plane
            .PlaneBuilder()
            .setManufacturer("American Army")
            .setModel("B-2")
            .setSeatingCapacity(2)
            .build());

        ListFlightService flightTool = new ListFlightService(flightDirectory);
        ListPlaneService planeTool = new ListPlaneService(planeDirectory);
        Flight forgotten = new Flight
            .FlightBuilder("Stockholm", "Madrid")
            .setDepartureTime(LocalTime.of(0, 20))
            .setArrivalTime(LocalTime.of(5, 40))
            .build();
        //TODO: override toString and fix whatever is causing this thing to malfunction, until then ignore whatever this is
        // flightTool = Arrays.addFlight(forgotten);
        // System.out.println(flightTool.getFlightDirectory().toString());
        // System.out.println(planeTool.getPlaneDirectory().toString());
        // System.out.println(planeTool.findPlaneBySeatingCapacity(2).toString());
    }
}
