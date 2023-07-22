package practice.oop.task9.models;

import java.time.LocalTime;

public final class Flight {

    private final String origin;
    private final String destination;
    private final LocalTime departureTime;
    private final LocalTime arrivalTime;

    private Flight(FlightBuilder builder) {
        this.origin = builder.origin;
        this.destination = builder.destination;
        this.departureTime = builder.departureTime;
        this.arrivalTime = builder.arrivalTime;
    }

    public String getOrigin() { return origin; }

    public String getDestination() { return destination; }

    public LocalTime getDepartureTime() { return departureTime; }

    public LocalTime getArrivalTime() { return arrivalTime; }

    // Builder class for Flight
    public static class FlightBuilder implements Builder<Flight> {

        private final String origin;
        private final String destination;
        private LocalTime departureTime;
        private LocalTime arrivalTime;

        public FlightBuilder(String origin, String destination) {
            
            this.origin = origin;
            this.destination = destination;
        }

        public FlightBuilder setDepartureTime(LocalTime departureTime) {
            
            this.departureTime = departureTime;
            return this;
        }

        public FlightBuilder setArrivalTime(LocalTime arrivalTime) {
            
            this.arrivalTime = arrivalTime;
            return this;
        }

        public Flight build() {
            // Validate that all required attributes are set before building Flight
            if (departureTime == null || arrivalTime == null) {
                throw new IllegalStateException("Departure time and arrival time must be set");
            }
            // Pass all attributes set in FlightBuilder to Flight constructor
            return new Flight(this);
        }
    }
}
