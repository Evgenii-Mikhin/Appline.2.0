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

    }
}


