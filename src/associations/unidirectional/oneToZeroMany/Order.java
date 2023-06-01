package associations.unidirectional.oneToZeroMany;

import associations.utilities.Item;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int idCount = 0;

    private int id;

    private List<Item> items;

    Order(){
        this.id = idCount++;
        items = new ArrayList<>();
    }

    public void addItem(Item i){
        this.items.add(i);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Order ").append(this.id).append( " with items:");

        for(Item i:items){
           str.append("\n\t");
           str.append(i.toString());
        }

        return  str.toString();
    }
}
