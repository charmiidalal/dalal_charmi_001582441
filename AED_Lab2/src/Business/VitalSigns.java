/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author charmiidalal
 */
public class VitalSigns {
    /* Program inputs in form of variables */
    private double temperature;
    private double bloodPressure;
    private int pulse;
    private String date;
    
    /* Getter method for Temperature */
    public double getTemperature() {
        return temperature;
    }
    
    /* Setter method for Temperature */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    /* Getter method for Blood Pressure */
    public double getBloodPressure() {
        return bloodPressure;
    }
    
    /* Setter method for Blood Pressure */
    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
    /* Getter method for Pulse */
    public int getPulse() {
        return pulse;
    }
    
    /* Setter method for Pulse */
    public void setPulse(int pulse) {
        this.pulse = pulse;
    }
    
    /* Getter method for Date */
    public String getDate() {
        return date;
    }
    
    /* Setter method for Temperature */
    public void setDate(String date) {
        this.date = date;
    }
    
    /* This method is for converting date object into string */
    @Override
    public String toString(){
        return this.date;
    }
   
}
