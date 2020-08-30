package Task_5_CalculatorOOP;

import java.util.Scanner;

/**
 * Задание №5
 *
 * @author Evgenii-Mikhin
 *  Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
 *  Архитектура: Были созданы класс UserNumber, который отвечает за получение числа от пользователя и класс Operation, отвечающий за получение от пользователя операции и выполнения этой операции. Создание экземпляров класса и метод main реализованы в классе Calculator

 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Создаем экземпляр класса Scanner для считывания чисел из консоли
        System.out.println("Введите число a, разделитель запятая");
        double a =scan.nextDouble();   //получение double a c консоли
        UserNumber aNumber = new UserNumber(scan);
        aNumber.setNumber(a);   //Вызов метода setNumber
        System.out.println("Введите число b, разделитель запятая");


        double b =scan.nextDouble();    //получение double b c консоли
        UserNumber bNumber = new UserNumber(scan);
        bNumber.setNumber(b);   //Вызов метода setNumber
        System.out.println("Введите операцию: '+', '/', '-', '*'");
        char oper = scan.next().charAt(0); //получение параметра oper c консоли
        Operation operation= new Operation(scan);

        operation.setOper(oper);
        operation.setResult(a,b,oper); //Вызов метода setResult

        scan.close(); //Закрытие сканера


    }


}

