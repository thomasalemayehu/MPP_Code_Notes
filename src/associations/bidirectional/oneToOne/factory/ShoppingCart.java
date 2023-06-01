package associations.bidirectional.oneToOne.factory;

import associations.utilities.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static int idCount;

    private int id;

    private Customer owner;

    private final List<Item> items;


    ShoppingCart(){
        this.id = idCount++;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer c) {
        this.owner = c;
    }

    public void addItem(String name, double price){
        this.items.add(new Item(name,price,1));
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Cart containing the following items: ");

        for(Item i:this.items){
            str.append("\n\t");
            str.append(i.getName());
        }

        return str.toString();
    }
}
