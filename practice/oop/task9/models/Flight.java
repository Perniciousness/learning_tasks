package practice.oop.task9.models;

import java.time.LocalTime;

public class Flight {
    
    private final String origin;
    private final String destination;
    private final LocalTime departureTime;
    private final LocalTime arrivalTime;

    public Flight(String origin, String destination, LocalTime departureTime, LocalTime arrivalTime) {

        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
    
    
}
