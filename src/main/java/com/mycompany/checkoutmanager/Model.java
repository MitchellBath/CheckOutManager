/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkoutmanager;

import java.util.ArrayList;

/**
 *
 * @author mbath
 */
public class Model implements java.io.Serializable{
    
    // model for serialization of data. Stores list of items.
    public ArrayList<Item> items;
    
    public Model() {
        items = new ArrayList<>();
    }
    
    public void test() {
    }
    
    public ArrayList getItems() {
        return items;
    }
    
    public void addItem(Item newitem) {
        items.add(newitem);
    }
    
    public void removeItem(String itemname) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName() == null ? itemname == null : items.get(i).getName().equals(itemname)) {
                // searching for item via string. catch
                items.remove(i);
                System.out.println("Deleted item");
                return;
            }
        }
    }
    
}
