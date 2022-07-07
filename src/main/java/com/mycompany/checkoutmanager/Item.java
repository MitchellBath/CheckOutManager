/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkoutmanager;

/**
 *
 * @author mbath
 */
public class Item implements java.io.Serializable{
    // items are the things you check in and out for students.
    // i didnt want to make this a class but it has two attributes that dont fit into a 2d array (string and bool)
    //also making everything public here because this will not interface beyond the uncc network and i dont get software dev pay
    // getters and setters just in case and habit
    
    // note actually items are checked out by students and store their SID. idk what i was thinking making it a bool
    
    public String name;
    public int sid;
    
    public Item() {
        this.name = "default";
        this.sid = -1;
    }
    public Item(String name) {
        this.name = name;
        this.sid = -1;
    }
    public Item (String name, int sid) {
        this.name = name;
        this.sid = sid;
    }
    
    public String getName() {
        return this.name;
    }
    public int getCheckedOut() {
        return this.sid;
    }
    
    public void setName(String newname) {
        this.name = newname;
    }
    
    public void setCheckedOut(int newval) {
        this.sid = newval;
    }
    
}
