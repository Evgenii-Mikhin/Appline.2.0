package Task_4_Gift;

public class Chocolate extends Sweets {
    private String type;

    public Chocolate() {
    }

    public Chocolate(double price, double weight, String type) {
        super(price, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy + [" + super.toString() + ", additives =" + type + "]";
    }
}

/**
 * Сладость Chocolate в которой задается уникальный параметр - тип шоколада и наследуются от метода сладостей параметры цены и веса.
 */