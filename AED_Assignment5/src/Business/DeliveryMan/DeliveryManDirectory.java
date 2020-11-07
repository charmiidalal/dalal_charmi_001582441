/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author  Charmi Dalal

 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;

    public DeliveryManDirectory(){
        deliveryManDirectory = new ArrayList<DeliveryMan>();
    }
    
    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public DeliveryMan add(DeliveryMan deliveryMan){
        deliveryMan.setDeliveryId("DeliveryMan"+(deliveryManDirectory.size()+1));
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void deleteDeliveryMan(int index,EcoSystem system){
        String id = deliveryManDirectory.get(index).getDeliveryId();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        deliveryManDirectory.remove(index);
    }
    
    public DeliveryMan getDeliveryManId(int index){
        return deliveryManDirectory.get(index);
    }
    
    public boolean isPhoneUnique(String phone){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public boolean isEmailUnique(String email){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
    
    public void updateDeliveryMan(String id,String name,String phone,String email){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getDeliveryId().equalsIgnoreCase(id)){
                deliveryMan.setName(name);
                deliveryMan.setPhoneNo(phone);
                deliveryMan.setEmail(email);
            }
        }
    }
    
    public DeliveryMan getDeliveryMan(String id){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getDeliveryId().equalsIgnoreCase(id)){
                return deliveryMan;
            }
        }
        return null;
    }
}
