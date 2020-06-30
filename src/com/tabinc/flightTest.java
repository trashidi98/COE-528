package com.tabinc;

import org.junit.Test;
import static org.junit.Assert.*;

public class flightTest {


    // Methods to test constructor
    @Test
    public void testConstructor(){
        Flight validFlight = new Flight(1234, "Toronto", "Calcutta", "03/02/9 7:50 PM", 1000, 500, 1000.55);

        //Methods to test each instantiated parameter
        assertEquals(validFlight.getFlightNumber(), 1234);
        assertEquals(validFlight.getOrigin(), "Toronto");
        assertEquals(validFlight.getDestination(), "Calcutta");
        assertEquals(validFlight.getDepartureTime(),"03/02/9 7:50 PM" );
        assertEquals(validFlight.getCapacity(), 1000);
        assertEquals(validFlight.getNumberOfSeatsLeft(), 500);
        assertEquals(validFlight.getOriginalPrice(), 1000.55, 2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidConstructor(){
        Flight invalidFlight = new Flight(1234, "Toronto", "Toronto", "03/02/9 7:50 PM", 1000, 500, 1000.55);
    }

    // Methods to test getters and setters
    @Test
    public void testGettersnSetters(){
        Flight flightFirst = new Flight(1234, "Toronto", "Calcutta", "03/02/9 7:50 PM", 1000, 500, 1000.55);
        assertEquals(flightFirst.getFlightNumber(), 1234);
        assertEquals(flightFirst.getOrigin(), "Toronto");
        assertEquals(flightFirst.getDestination(), "Calcutta");
        assertEquals(flightFirst.getDepartureTime(),"03/02/9 7:50 PM" );
        assertEquals(flightFirst.getCapacity(), 1000);
        assertEquals(flightFirst.getNumberOfSeatsLeft(), 500);
        assertEquals(flightFirst.getOriginalPrice(), 1000.55, 2);

        // Booking a seat should decrement the number of seats left
        flightFirst.bookASeat();
        assertEquals(499, flightFirst.getNumberOfSeatsLeft());

        // Testing the string representation of the Flight model
        assertEquals("Flight 1234, Toronto to Calcutta, 03/02/9 7:50 PM, original price: 1000.55$", flightFirst.toString());

    }

}

