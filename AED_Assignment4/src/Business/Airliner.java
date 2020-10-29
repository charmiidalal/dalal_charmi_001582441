/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Charmi Dalal
 */
public class Airliner {

    private String airlineName;
    private String airlineCode;
    private int airlineCount;
    private String fromCountry;

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getAirlineCount() {
        return airlineCount;
    }

    public void setAirlineCount(int airlineCount) {
        this.airlineCount = airlineCount;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    @Override
    public String toString() {
        return this.getAirlineName();
    }
}
