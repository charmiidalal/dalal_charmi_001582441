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

    /* Get and set flight time phase */
    public String getFlightTimePhase() {
        return flightTimePhase;
    }

    public void setFlightTimePhase(String flightTimePhase) {
        this.flightTimePhase = flightTimePhase;
    }
    /* Get and set flightOwner */
    public String getFlightOwner() {
        return flightOwner;
    }

    public void setFlightOwner(String flightOwner) {
        this.flightOwner = flightOwner;
    }
    /* Get and set FLight number */
    public String getFlightNumber() {
        return flightNumber;
    }
    
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    /* Get and set FLight Source */
    public String getFlightSource() {
        return flightSource;
    }

    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }
    /* Get and set FLight destination */
    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }
    /* Get and set FLight departure time */
    public String getFlightDepTime() {
        return flightDepTime;
    }

    public void setFlightDepTime(String flightDepTime) {
        this.flightDepTime = flightDepTime;
    }
    /* Get and set flight arrival time */
    public String getFlightArrTime() {
        return flightArrTime;
    }

    public void setFlightArrTime(String flightArrTime) {
        this.flightArrTime = flightArrTime;
    }
    /* Get and set FLight price */
    public Double getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(Double fllightPrice) {
        this.flightPrice = fllightPrice;
    }

    public Date getFlightDate() {
        return flightDate;
    }
    /* Get and set FLight date */
    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public Seats getFlightSeats() {
        return flightSeats;
    }
    /* Get and set FLight seats */
    public void setFlightSeats(Seats flightSeats) {
        this.flightSeats = flightSeats;
    }
    /* Get and set FLight duration */
    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

}
