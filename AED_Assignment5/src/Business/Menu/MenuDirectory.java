/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author Charmi Dalal
 */
public class MenuDirectory {
    private ArrayList<Item> menuDirectory;
    
    public MenuDirectory(){
        menuDirectory = new ArrayList<Item>();
    }

    public ArrayList<Item> getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(ArrayList<Item> menuDirectory) {
        this.menuDirectory = menuDirectory;
    }

    public void add(String restaurantId, String name, double price, String description) {     
        Item item = new Item();
        item.setItemNo("MenuItem"+(menuDirectory.size()+1));
        item.setItemName(name);
        item.setPrice(price);
        item.setRestaurantNo(restaurantId);
        item.setIngrediants(description);
        menuDirectory.add(item);
    }
    
    public Item fetchItem(String itemId){
        for(Item item: menuDirectory){
            if(item.getItemNo().equalsIgnoreCase(itemId)){
                return item;
            }
        }
        return null;
    }

    public void updateItem(String itemNo, String itemName, String ingrediants, Double price) {
        for(Item item: menuDirectory){
            if(item.getItemNo().equalsIgnoreCase(itemNo)){
                item.setItemName(itemName);
                item.setIngrediants(ingrediants);
                item.setPrice(price);
            }
        }
    }
    
    public void deleteItem(String id){
        for(int i =0; i< menuDirectory.size();i++){
            if(menuDirectory.get(i).getItemNo().equalsIgnoreCase(id)){
                menuDirectory.remove(i);
            }
        }
    }
    
    public Item getItemByKey(int key){
        return menuDirectory.get(key);
    }
}
