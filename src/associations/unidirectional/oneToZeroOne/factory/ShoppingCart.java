package associations.unidirectional.oneToZeroOne.factory;

import associations.utilities.Item;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static int idCount;

    private int id;

    private final List<Item> items;

    private ShoppingCart(Customer cust){
        this.id=idCount++;
        this.items = new ArrayList<>();

        cust.setCart(this);
    }

    public static ShoppingCart newShoppingCart(Customer cust){
        if(cust == null) throw new NullPointerException("NO Customer Provided");

        return new ShoppingCart(cust);
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
}
