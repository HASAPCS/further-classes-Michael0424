package com.example;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private String destination;
    private String origin;
    private List<Passenger> passengers;

    public Flight(String flightNumber, String destination, String origin) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.passengers = new ArrayList<>();
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getOrigin() {
        return this.origin;
    }

    public List<Passenger> getPassengers() {
        return this.passengers;
    }

    public void setFlightNumber(String newFlightNumber) {
        this.flightNumber = newFlightNumber;
    }

    public void setDestination(String newDestination) {
        this.destination = newDestination;
    }

    public void setOrigin(String newOrigin) {
        this.origin = newOrigin;
    }

    public void setPassengers(List<Passenger> newPassengers) {
        this.passengers = newPassengers;
    }

    // TODO: Implement methods to book a flight for a passenger and cancel a booking
    public void bookPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void cancelBooking(Passenger passenger) {
        passengers.remove(passenger);
    }
}