package practice.oop.task9.services.impl;

import java.util.List;

import practice.oop.task9.models.Flight;
import practice.oop.task9.services.FlightService;

public class ListFlightService implements FlightService {

    private List<Flight> flightDirectory;

    public ListFlightService(List<Flight> flightDirectory) {
        
        this.flightDirectory = flightDirectory;
    }

    public List<Flight> getFlightDirectory() {
        
        return flightDirectory;
    }

    @Override
    public void addFlight(Flight flight) {
        
        flightDirectory.add(flight);
    }

    @Override
    public void removeFlight(Flight flight) {
        
        flightDirectory.remove(flight);
    }    
}
