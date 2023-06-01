package associations.unidirectional.oneToOne;

import associations.utilities.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static int idCount = 0;

    private int id;
    private List<Item> items;

    // package level constructor to avoid create of shopping cart object
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item i){
        this.items.add(i);
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