package associations.unidirectional.oneToZeroMany;

import associations.utilities.Item;

public class Usage {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        Order custOrder = customer.addOrder();
        custOrder.addItem(new Item("Shoes",12.99,1));
        custOrder.addItem(new Item("Shorts",14.00,1));
        custOrder.addItem(new Item("Mini Fridge",93.00,1));

        System.out.println(customer);
    }
}
