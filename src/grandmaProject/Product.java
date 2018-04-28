package grandmaProject;

public class Product {
    private String name;
    private int amount;
    private double price;
    private double value;

    public Product(String name, int amount, double price, double value) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.value = value;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", value=" + value +
                '}';
    }
}
