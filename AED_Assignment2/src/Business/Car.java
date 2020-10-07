/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
/**
 *
 * @author manushpatel
 */
public class Car {
    /* Declare required variables for Car*/
    private String carName;
    private boolean isAvailable;
    private String timeAvailable;
    private String manufacturerName;
    private int manufactureYear;
    private int seatCapacity;
    private String serialNo;
    private String modelNo;
    private String city;
    private boolean isExpired;

    /* Add getters and setters for all the variables */
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getTimeAvailable() {
        return timeAvailable;
    }

    public void setTimeAvailable(String timeAvailable) {
        this.timeAvailable = timeAvailable;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsExpired() {
        return isExpired;
    }

    public void setIsExpired(boolean isExpired) {
        this.isExpired = isExpired;
    }
    
    /* Create function to get car name as a string */
    @Override
    public String toString(){
        return carName;
    }
    
    /* Overrride equals function to check if seriial no is unique */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (!this.serialNo.equals(other.serialNo)) {
            return false;
        }
        return true;
    }
  
}
