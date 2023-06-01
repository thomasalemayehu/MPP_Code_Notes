package associations.unidirectional.oneToZeroMany;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static int idCount = 0;

    private int id;

    private String name;

    private List<Order> orders;

    public Customer(String name){
        this.id = idCount++;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order addOrder(){
        Order newOrder = new Order();
        this.orders.add(newOrder);
        return newOrder;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Customer ").append(this.name).append(" with ");

        for(Order or:orders){
            str.append(or.toString());
        }

        return str.toString();
    }
}
