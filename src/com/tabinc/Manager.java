package com.tabinc;

import java.util.ArrayList;

public class Manager {

    ArrayList<Ticket> ticketNumArray = new ArrayList<Ticket>();
    ArrayList<Flight> flightsArray = new ArrayList<Flight>();


    public void createFlights(){

        Flight flight1 = new Flight(1234,
                "Toronto",
                "Calcutta",
                "03/02/99 7:50 PM",
                1000,
                1000,
                1000.55);

        Flight flight2 = new Flight(5678,
                "Calcutta",
                "Toronto",
                "05/06/87 8:00 PM",
                700,
                300,
                1500.44);

        Flight flight3 = new Flight(9101,
                "Hyde Park",
                "NeverLand",
                "01/02/03 8:10 PM",
                2000,
                500,
                675.22);

        flightsArray.add(flight1);
        flightsArray.add(flight2);
        flightsArray.add(flight3);

    }

    public void displayAvailableFlights(String origin, String destination){
        for(Flight flight : flightsArray){
            if(flight.getNumberOfSeatsLeft() != 0 && flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)){
                System.out.println("Available Flights:" + "\n" + flight.toString());
            }
        }
    }

    public Flight getFlight(int flightNumber){
        for(Flight f : flightsArray){
            if(f.getFlightNumber() == flightNumber){
                return f;
            }
        }
        return null;
    }

    public void bookSeat(int flightNumber, Passenger p){
        Flight desiredFlight = getFlight(flightNumber);
        double discountedPrice = 0;
        if(desiredFlight.bookASeat()){
            discountedPrice = desiredFlight.getOriginalPrice() - p.getDiscount()*desiredFlight.getOriginalPrice();
        }
        Ticket ticket = new Ticket(p, desiredFlight, discountedPrice);
        ticketNumArray.add(ticket);
    }


    public static void main(String[] args) {

        //TODO: WRITE ALL SCENARIOS FOR THE MAIN CLASS AND FIND OUT WHAT THAT MEANS IN THE FIRST CLASS CAPACITY
        // VS SEATSLEFT

        Manager manager = new Manager();
        Passenger p1 = new Member("Nathaniel", 66, 6);

        manager.createFlights();

        System.out.println(manager.flightsArray);

        manager.displayAvailableFlights("Toronto", "Calcutta");
        manager.bookSeat(1234, p1);

        System.out.println(manager.getFlight(1234).getNumberOfSeatsLeft());

        for (Ticket t : manager.ticketNumArray){
            System.out.println(t);
        }

    }
}