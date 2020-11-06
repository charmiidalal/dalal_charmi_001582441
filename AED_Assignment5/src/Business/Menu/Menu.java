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
public class Menu {

    private ArrayList<Item> menuList;

    public Menu() {
        menuList = new ArrayList<Item>();
    }

    public ArrayList<Item> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Item> menuList) {
        this.menuList = menuList;
    }

}
