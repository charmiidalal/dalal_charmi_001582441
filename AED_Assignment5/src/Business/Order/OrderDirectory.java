/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class OrderDirectory {

    private ArrayList<Order> orderDirectory;

    public OrderDirectory() {
        orderDirectory = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<Order> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public Order getOrderById(int index) {
        return orderDirectory.get(index);
    }

    public Order add() {
        Order order = new Order();
        orderDirectory.add(order);
        return order;
    }

    public Order fetchOrder(String OrderNo) {
        for (Order order : orderDirectory) {
            if (order.getOrderNo().equalsIgnoreCase(OrderNo)) {
                return order;
            }
        }
        return null;
    }
}
