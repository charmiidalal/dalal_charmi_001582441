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
    
    private List<Customer> personList;
    public CustomerDirectory() {
    
        personList = new ArrayList<Customer>();
    }
    
    public List<Customer> getPersonlist(){
        return personList;
    }
}
