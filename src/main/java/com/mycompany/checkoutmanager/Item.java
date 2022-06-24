/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkoutmanager;

/**
 *
 * @author mbath
 */
public class Item {
    // items are the things you check in and out for students.
    // i didnt want to make this a class but it has two attributes that dont fit into a 2d array (string and bool)
    //also making everything public here because this will not interface beyond the uncc network and i dont get software dev pay
    // getters and setters just in case and habit
    
    public String name;
    public boolean checkedOut;
    
    public Item() {
        this.name = "default";
        this.checkedOut = false;
    }
    public Item(String name) {
        this.name = name;
        this.checkedOut = false;
    }
    public Item (String name, boolean checkedOut) {
        this.name = name;
        this.checkedOut = checkedOut;
    }
    
    public String getName() {
        return this.name;
    }
    public boolean getCheckedOut() {
        return this.checkedOut;
    }
    
    public void setName(String newname) {
        this.name = newname;
    }
    
    public void setCheckedOut(boolean newval) {
        this.checkedOut = newval;
    }
    
}
