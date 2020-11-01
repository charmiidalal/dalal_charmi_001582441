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
 * @author Charmi Dalal
 */
public class CustomerDirectory {

    public static List<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        customerList.add(c);
    }

    public void setCustomerList(List<Customer> customerList) {
        CustomerDirectory.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

}
