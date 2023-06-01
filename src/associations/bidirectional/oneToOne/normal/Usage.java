package associations.bidirectional.oneToOne.normal;


public class Usage {
    public static void main(String[] args) {
        Customer customer = new Customer("John");
        customer.getCart().addItem("Shoes",32.25);
        customer.getCart().addItem("Shorts",12.99);

        System.out.println(customer);
    }
}