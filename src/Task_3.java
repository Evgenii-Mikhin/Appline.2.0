import java.util.Scanner;

/**
 * Задание №3
 *
 * @author Evgenii-Mikhin
 * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 * 2. Поиск максимального элемента в массиве. Для начала задать массив слов.
 * Размерность массива произвольна, задается в консоли.
 * После чего в консоли вводятся слова в количестве равном заданной длине массива.
 * В полученном массиве необходимо найти самое длинное слово.
 * Результат вывести на консоль
 * 3. Программа должна выполнять одно из заданий на выбор.
 * Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 */
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Создаем экземпляр класса Scanner для считывания чисел из консоли
        Calculate calculate = new Calculate(scan); // Создание экземпляра класса калькулятора,который на вход принимает данные из сканера
        calculate.operation(scan); // Вызов метода operation экземпляра созданного класса calculate
        scan.close(); //Закрытие сканера

    }

    /**
     * Класс калькулятора и описание его методов
     */
    public static class Calculate {
        double a;
        double b;

        /**
         * @param scan экземпляр класса Scanner с помощью данного параметра считываются данные из консоли
         *             Конструктор позволяет на вход получать число а и b из консоли и проверить формат введенных данных.
         */
        public Calculate(Scanner scan) throws NumberFormatException {
            while (true) {
                try{
                     System.out.println("Введите число a");
                     a = Double.parseDouble(scan.nextLine().replace(',','.'));  // Добавлена проверка на то что введена цифра в формате double, если это не так, то выдается ошибка.
                    // Замена a=scan.nextDouble();. Запятая меняется на точку для корректного парсинга строки ввода с консоли
                     break;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат данных");
                }
            }
            while (true) {
                try {
                      System.out.println("Введите число b");
                      b = Double.parseDouble(scan.nextLine().replace(',','.')); // Добавлена проверка на то что введена цифра в формате double, если это не так, то выдается ошибка.
                    // Замена b = scan.nextDouble();. Запятая меняется на точку для корректного парсинга строки ввода с консоли
                      break;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат данных");
                }
            }
        }

        /**
         * @param scan экземпляр класса Scanner с помощью данного параметра считываются данные из консоли
         *             Метод operation позволяет вводить операцию и выполнять ее над введенными ранее числами a и b
         */
        public void operation(Scanner scan) {
            char oper;
            System.out.println("Введите операцию: '+', '/', '-', '*'");

            oper = scan.next().charAt(0);
            switch (oper) {
                case '+':
                    System.out.printf("Результат: %.4f %n", a + b);
                    break;
                case '-':
                    System.out.printf("Результат: %.4f %n", a - b);
                    break;
                case '*':
                    System.out.printf("Результат: %.4f %n", a * b);
                    break;
                case '/':
                    System.out.printf("Результат: %.4f %n", a / b);
                    break;
                default:
                    System.out.println("Такая операция не реализована");

            }
        }

    }


}