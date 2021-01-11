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

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.totalWeight = 0;
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int weight = this.totalWeight + suitcase.totalWeight();
        
        if (weight <= this.maxWeight) {
            this.suitcases.add(suitcase);
            this.totalWeight = this.totalWeight + suitcase.totalWeight();
        }

    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }
    
}
