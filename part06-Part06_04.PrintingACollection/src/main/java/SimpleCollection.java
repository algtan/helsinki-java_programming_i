
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        
        int elmnts = this.getElements().size();
        
        String elementOutput = "";
        
        if (elmnts > 1) {
            for (String element: elements) {
                elementOutput = elementOutput + element + "\n";
            }
            return "The collection " + this.name + " has " + elmnts + " elements:\n" + elementOutput;
        } else {
            elementOutput = this.elements.get(0);
            return "The collection " + this.name + " has " + elmnts + " element:\n" + elementOutput;
        }
        
    }
    
}
