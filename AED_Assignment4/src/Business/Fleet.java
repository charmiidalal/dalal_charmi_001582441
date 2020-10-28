/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manushpatel
 */
public class Fleet {
    private List<Airplane> airplaneList;

    public Fleet() {
        airplaneList = new ArrayList<Airplane>();
    }

    public List<Airplane> getAirplanelist() {
        return airplaneList;
    }
}
