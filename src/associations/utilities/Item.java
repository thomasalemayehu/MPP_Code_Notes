package associations.utilities;

public class Item {
    private static int idCount = 0;

    private int id;
    private String name;
    private double price;
    private int count;

    public Item(String name,double price,int count){
        this.id = idCount++;
        this.name = name;
        this.price = price;
        this.count = 1;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
