/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.DeliveryMan.DeliveryMan;
import Business.Role.Role;

/**
 *
 * @author Hui Huang
 */
public class DeliverManAccount extends UserAccount{
    private DeliveryMan deliveryMan;

    public DeliverManAccount(String username, String password, Role role, DeliveryMan deliveryMan) {
        super(username, password, role);
        this.deliveryMan = deliveryMan;
        //this.setRole(new Business.Role.DeliveryMan());
    }
    
    public DeliveryMan getDriver() {
        return this.deliveryMan;
    }

    public void setDriver(DeliveryMan driver) {
        this.deliveryMan = deliveryMan;
    }
    
    
}
