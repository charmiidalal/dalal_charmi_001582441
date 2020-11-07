/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.EcoSystem;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantDirectory;

    public RestaurantDirectory() throws IOException{
        restaurantDirectory = new ArrayList<Restaurant>();
    }
    
    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public void add(Restaurant restaurant) {
       restaurant.setRestaurantNo("Restaurant"+(restaurantDirectory.size()+1));
       restaurantDirectory.add(restaurant);
    }
    
    public void deleteRestaurant(int index,EcoSystem system){
        String id = restaurantDirectory.get(index).getRestaurantNo();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountList().size();i++){
            if(system.getUserAccountDirectory().getUserAccountList().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        restaurantDirectory.remove(index);
    }
    
    public Restaurant getRestaurantNo(int index){
        return restaurantDirectory.get(index);
    }

    public String getRestName(String restaurantId) {
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getRestaurantNo().equalsIgnoreCase(restaurantId)){
                return restaurant.getRestaurantName();
            }
        }
        return "";
    }
    
    public Restaurant getRestaurant(String id){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getRestaurantNo().equalsIgnoreCase(id)){
                return restaurant;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getMobileNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    public boolean isEmailUnique(String email){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getEmail().equalsIgnoreCase(email)){
                return false;
            }
        }
        return true;
    }
}
