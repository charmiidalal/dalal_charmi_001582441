/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Dinesh Kumar
 */
public class Seats {

    ArrayList<String> seatList;

    public Seats() {
        seatList = new ArrayList<>();
        for (int i = 1; i <= 25; i++) {
            seatList.add(Integer.toString(i) + "A (W)");
            seatList.add(Integer.toString(i) + "B (M)");
            seatList.add(Integer.toString(i) + "C (A)");
            seatList.add(Integer.toString(i) + "D (A)");
            seatList.add(Integer.toString(i) + "E (M)");
            seatList.add(Integer.toString(i) + "F (W)");
        }
    }

    public ArrayList<String> getSeat() {
        return seatList;
    }

    public void setSeat(ArrayList<String> seat) {
        this.seatList = seatList;
    }
}
