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
public class Customer {
    private String cstFirstName;
    private String cstLastName;
    private int cstAge;
    private String cstPhoneNum;
    private Flight cstFlight;
    private String cstSeat;

    public String getCstFirstName() {
        return cstFirstName;
    }

    public void setCstFirstName(String cstFirstName) {
        this.cstFirstName = cstFirstName;
    }

    public String getCstLastName() {
        return cstLastName;
    }

    public void setCstLastName(String cstLastName) {
        this.cstLastName = cstLastName;
    }

    public int getCstAge() {
        return cstAge;
    }

    public void setCstAge(int cstAge) {
        this.cstAge = cstAge;
    }

    public String getCstPhoneNum() {
        return cstPhoneNum;
    }

    public void setCstPhoneNum(String cstPhoneNum) {
        this.cstPhoneNum = cstPhoneNum;
    }

    public Flight getCstFlight() {
        return cstFlight;
    }

    public void setCstFlight(Flight cstFlight) {
        this.cstFlight = cstFlight;
    }

    public String getCstSeat() {
        return cstSeat;
    }

    public void setCstSeat(String cstSeat) {
        this.cstSeat = cstSeat;
    }
    
}
