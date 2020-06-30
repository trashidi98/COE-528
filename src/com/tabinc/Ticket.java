package com.tabinc;

public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int ticketNumber = 0;

    public Ticket(Passenger pass, Flight flite, double dollars) {
        this.passenger = pass;
        this.flight = flite;
        this.price = dollars;
        this.ticketNumber++;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPrice() {
        return price;
    }

    public static int getTicketNumber() {
        return ticketNumber;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return passenger.getName() + ", "
                + "Flight " + flight.getFlightNumber() + ", "
                + flight.getOrigin() + " to "
                + flight.getDestination() + ", "
                + flight.getDepartureTime() + ", "
                + flight.getOriginalPrice() + ": " + "$"  + ", "
                + "ticket price: " + this.price;
    }
}
