/**
 * @param oper
 * Метод setOper получает операцию от пользователя
 * Метод setResult выполняет операцию над введенными ранее числами number1 и number2
 */
package Task_5_CalculatorOOP;

import javax.swing.*;
import java.util.Scanner;

public class Operation {
    char oper;
    double result;

    public Operation(Scanner scan) {

    }

    public char getOper(Scanner scan) {
        return oper;
    }

    public char setOper(char oper) { //Ответ пользователю в случае корректного/не корректного ввода в консоль
        switch (oper) {
            case '+':
            case '-':
            case '*':
            case '/':
                System.out.print("Операция принята");
                break;
            default:
                System.out.print("Такая операция не реализована");

        }

        return oper;
    }

    public double getResult() {
        return result;
    }

    public double setResult(double number1, double number2, char oper) { //Производится операция в зависимости от введенного пользователем значения
        switch (oper) {
            case '+':
                result = number1 + number2;
                System.out.printf("Результат: %.4f %n", result);
                break;
            case '-':
                result = number1 - number2;
                System.out.printf("Результат: %.4f %n", result);
                break;
            case '*':
                result = number1 * number2;
                System.out.printf("Результат: %.4f %n", result);
                break;
            case '/':
                if (number2 != 0.0){
                result = number1 / number2;
                System.out.printf("Результат: %.4f %n", result);
                } else {
                    System.out.println("На ноль делить нельзя"); // Не используется конструкция try-catch c ArithmeticException, тк при делении double на 0.0, JVM вернет бесконечность (NaN). Работает только с целыи числами.
                }
                break;


        }
        return result;
    }

}

