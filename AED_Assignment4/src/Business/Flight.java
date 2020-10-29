/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Charmi Dalal
 */
public class Flight {

    private String flightOwner;
    private String flightNumber;
    private String flightSource;
    private String flightDestination;
    private String flightDepTime;
    private String flightArrTime;
    private Double flightPrice;
    private Date flightDate;
    private Seats flightSeats;
    private int flightDuration;
    private String flightTimePhase;

    public String getFlightTimePhase() {
        return flightTimePhase;
    }

    public void setFlightTimePhase(String flightTimePhase) {
        this.flightTimePhase = flightTimePhase;
    }

    public String getFlightOwner() {
        return flightOwner;
    }

    public void setFlightOwner(String flightOwner) {
        this.flightOwner = flightOwner;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightSource() {
        return flightSource;
    }

    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public String getFlightDepTime() {
        return flightDepTime;
    }

    public void setFlightDepTime(String flightDepTime) {
        this.flightDepTime = flightDepTime;
    }

    public String getFlightArrTime() {
        return flightArrTime;
    }

    public void setFlightArrTime(String flightArrTime) {
        this.flightArrTime = flightArrTime;
    }

    public Double getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(Double fllightPrice) {
        this.flightPrice = fllightPrice;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public Seats getFlightSeats() {
        return flightSeats;
    }

    public void setFlightSeats(Seats flightSeats) {
        this.flightSeats = flightSeats;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

}
