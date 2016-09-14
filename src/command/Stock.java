package command;

/**
 * Created by khiem on 9/5/16.
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [Name: " + name + ", Quantiry: " + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [Name: " + name + ", Quantity: " + quantity + "] sold");
    }
}
