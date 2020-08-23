package Task_4_Gift;
/**
 * Задание №4
 *
 * @author Evgenii-Mikhin

 * 2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */
public class Present {
    public static void main(String[] args) {
        double totalPrice = 0;
        double totalWeight = 0;
        Candy candy1 = new Candy(50.00, 20, " with chocolate");
        Chocolate chocolate1 = new Chocolate(10, 8, " black сhocolate");
        Jellybean jellybean1 = new Jellybean(15, 25, " red");
        Sweets[] present = {candy1, chocolate1, jellybean1};
        totalPrice = candy1.getPrice() + jellybean1.getPrice() + chocolate1.getPrice();
        totalWeight = candy1.getWeight() + jellybean1.getWeight() + chocolate1.getWeight();
        for (Sweets presentSweets : present) {
            System.out.println(presentSweets.toString());
        }
        System.out.println("Total prise = " + totalPrice);
        System.out.println("Total weight = " + totalWeight);

    }

}
/**
 * Формирование подарка, подсчет общего веса и общей стоимости.
 * Главный метод. создаются по 1 из экземпляров каждого класса сладостей (Sweets).
 * Вывод всех заданных в задании данных на консоль.
 */