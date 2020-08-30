/**
 * Получение чисел от пользователя.
 */
package Task_5_CalculatorOOP;

import java.util.Scanner;

public class UserNumber {

    double number;

    public UserNumber(Scanner scan) {

    }

    public double getNumber(Scanner scan) {
        number = scan.nextDouble();
        return number;
    }

    public void setNumber(double number)
    //throws NumberFormatException
    {
        this.number = number;
        /*Так же в данном методе можно осуществить проверку на введенный разделитель.
        while (true) {
        try {
        System.out.println("Введите число");
        number = Double.parseDouble(scan.next().replace(',', '.'));  // Добавлена проверка на то что введена цифра в формате double, если это не так, то выдается ошибка
        break;
        } catch (NumberFormatException e) {
        System.out.println("Неверный формат данных");
         */
            }
}


