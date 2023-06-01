package associations.bidirectional.oneToOne.factory;


public class Usage {
    public static void main(String[] args) {
        Customer customer = CustomerShoppingCartFactory.newCustomer("John");
        customer.getCart().addItem("Shoes",32.25);
        customer.getCart().addItem("Shorts",12.99);

        System.out.println(customer);
    }
}
