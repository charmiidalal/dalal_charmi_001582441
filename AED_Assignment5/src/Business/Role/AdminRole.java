/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.RestaurantWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerDirectory customerDirectory,RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory,MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        return new RestaurantWorkAreaJPanel(userProcessContainer,account,business,restaurantDirectory,deliveryManDirectory,menuDirectory,orderDirectory);
    }

    
    
}
