package com.tabinc;

// Just Adding a comment 

public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    //Constructor method

    public Flight(int flightnum,
                  String orig,
                  String destina,
                  String departTime,
                  int cap,
                  int numSeatsLeft,
                  double origPrice
    ) {
        this.flightNumber = flightnum;
        this.origin = orig;
        this.destination = destina;
        this.departureTime = departTime;
        this.capacity = cap;
        this.numberOfSeatsLeft = numSeatsLeft;
        this.originalPrice = origPrice;

        if (origin.equals(destina)) {
            throw new IllegalArgumentException("Origin and Destination cannot be the same!");
        }

        //numberOfSeatsLeft var to be initialized depending on specified capacity

    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int valueToSet){
        this.flightNumber = valueToSet;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String valueToSet){
        this.origin = valueToSet;
    }
    public String getDestination() {
        return destination;
    }

    public void setDestination(String valueToSet){
        this.destination = valueToSet;
    }
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String valueToSet) {
        this.departureTime = valueToSet;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int valueToSet){
        this.capacity = valueToSet;
    }
    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    public void setNumberOfSeatsLeft(int valueToSet){
        this.numberOfSeatsLeft = valueToSet;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double valueToSet){
        this.originalPrice = valueToSet;
    }



    public boolean bookASeat(){
        if(numberOfSeatsLeft > 0){
            numberOfSeatsLeft--;
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Flight " + flightNumber + ", " + origin + " to " + destination + ", "
                + departureTime + ", " + "original price: " + originalPrice + "$";

    }


}
