package associations.unidirectional.oneToZeroOne.normal;


import associations.utilities.Item;

public class Usage {
    public static void main(String[] args) {
        Customer customer = new Customer("John");
        customer.addCart();
        customer.getCart().addItem(new Item("Shoes",32.25,1));
        customer.getCart().addItem(new Item("Shorts",12.99,2));

        System.out.println(customer);
    }
}
