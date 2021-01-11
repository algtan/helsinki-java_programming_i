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

public class TodoList {
    private ArrayList<String> items;
    
    public TodoList() {
        this.items = new ArrayList<>();
    }
    
    public void add(String task) {
        this.items.add(task);
    }
    
    public void print() {
        for (String item: items) {
            int taskNo = this.items.indexOf(item) + 1;
            System.out.println(taskNo + ": " + item);
        }
    }
    
    public void remove(int number) {
        this.items.remove(number - 1);
    }
}
