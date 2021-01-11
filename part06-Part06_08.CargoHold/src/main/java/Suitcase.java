/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Allen
 */
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int totalWeight;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.totalWeight = 0;
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        int weight = this.totalWeight + item.getWeight();
        
        if (weight <= this.maxWeight) {
            this.items.add(item);
            this.totalWeight = this.totalWeight + item.getWeight();
        }
    }
    
    public String toString() {
        if (this.items.size() > 1) {
            return this.items.size() + " items (" + this.totalWeight + " kg)";
        } else if (this.items.size() == 1) {
            return this.items.size() + " item (" + this.totalWeight + " kg)";
        } else {
            return "no items (0 kg)";
        }
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Item heaviestItem() {
        // If suitcase is empty, return null
        if (this.items.isEmpty()) {
            return null;
        }
        
        // Begin with the first object
        Item heaviest = this.items.get(0);
        
        // Compare first object with the rest of the objects
        for (Item item: items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        // After going through all the objects, return the heaviesst one
        return heaviest;
    }
}
