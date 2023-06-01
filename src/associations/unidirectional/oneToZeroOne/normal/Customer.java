package associations.unidirectional.oneToZeroOne.normal;


public class Customer {
    private static int idCount = 0;

    private int id;

    private String name;

    private ShoppingCart cart;

    public Customer(String name){
        this.id = idCount++;
        this.name = name;
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

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public void addCart(){
        if(this.cart == null) cart = new ShoppingCart();
    }

    @Override
    public String toString(){
        return name + " with " + cart.toString();
    }

}
