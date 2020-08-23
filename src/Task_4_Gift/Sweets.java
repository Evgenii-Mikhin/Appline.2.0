package Task_4_Gift;

public abstract class Sweets {
    private double price;
    private double weight;

    public Sweets() {
    }

    public Sweets(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sweets{" +
                "price='" + price + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
/**
 *  Абстрактный класс в котором задается цена и вес
 */