package Task_4_Gift;


public class Jellybean extends Sweets {
    private String color;

    public Jellybean() {
    }

    public Jellybean(double price, double weight, String color) {
        super(price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Candy + [" + super.toString() + ", additives =" + color + "]";
    }
}
/**
 * Сладость Jellybean в которой задается уникальный параметр - цвет жевательных конфет и наследуются от метода сладостей параметры цены и веса.
 */