// classe per la rappresentazione degli ordini
public class Order {
    private int id;
    private String product;
    private double price;

    public Order(int id, String product, double price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
