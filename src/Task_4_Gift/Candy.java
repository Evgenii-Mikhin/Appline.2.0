package Task_4_Gift;

public class Candy extends Sweets {
    private String additives;

    public Candy() {
    }

    public Candy(double price, double weight, String additives) {
        super(price, weight);
        this.additives = additives;
    }

    public String getAdditives() {
        return additives;
    }

    public void setAdditives(String additives) {
        this.additives = additives;
    }

    @Override
    public String toString() {
        return "Candy + [" + super.toString() + ", additives =" + additives + "]";
    }
}
/**
 * Сладость Candy в которой задается уникальный параметр добавок и наследуются от метода сладостей параметры цены и веса.
 */