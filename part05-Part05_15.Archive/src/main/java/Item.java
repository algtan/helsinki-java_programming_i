/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allen
 */
public class Item {
    private String id;
    private String name;
    
    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if ((compared instanceof Item) == false) {
            return false;
        }
        
        Item comparedItem = (Item) compared;
        
        if (this.id.equals(comparedItem.id)) {
            return true;
        }
        
        return false;
    }
    
    public String toString() {
        return this.id + ": " + this.name;
    }
}
