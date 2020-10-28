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
public class CustomerDirectory {
    
    private List<Person> personList;
    public CustomerDirectory() {
    
        personList = new ArrayList<Person>();
    }
    
    public List<Person> getPersonlist(){
        return personList;
    }
}
