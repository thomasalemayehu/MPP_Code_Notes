package associations.bidirectional.oneToOne.factory;



public class CustomerShoppingCartFactory {
    public static Customer newCustomer(String name){
        Customer cust = new Customer(name);

        ShoppingCart cart = new ShoppingCart();

        cart.setOwner(cust);
        cust.setCart(cart);

        return  cust;
    }
}
