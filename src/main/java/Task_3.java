import java.util.Arrays;
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
 * 3. Программа должна выполнять одно из заданий на выбор.
 * Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - пои
 *  * Результат вывести на консольск максимального слова в массиве.
 */
public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Создаем экземпляр класса Scanner для считывания чисел из консоли
        //Выбор операции
        System.out.println("Если хотите запустить калькулятор,введите номер 1, А если поиск максимального слова - 2");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                Calculate calculate = new Calculate(scan); // Создание экземпляра класса калькулятора,который на вход принимает данные из сканера
                calculate.operation(scan); // Вызов метода operation экземпляра созданного класса calculate
                break;
            case 2:
                MaxArray maxArray = new MaxArray (scan); // Создание экземпляра класса поиска максимального массива,который на вход принимает данные из сканера
                maxArray.maxOperation(); //вызов метода подсчета максимального слова в массиве

                break;
            default:
                System.out.println("Операция не верна");
        scan.close(); //Закрытие сканера
        }
    }
    /**
     * Класс калькулятора и описание его методов
     */
    private static class Calculate {
        double a;
        double b;

        /**
         * @param scan экземпляр класса Scanner с помощью данного параметра считываются данные из консоли
         * Конструктор позволяет на вход получать число а и b из консоли и проверить формат введенных данных.
         */
        private Calculate(Scanner scan) throws NumberFormatException {
            while (true) {
                try{
                    System.out.println("Введите число a");
                    a = Double.parseDouble(scan.next().replace(',','.'));  // Добавлена проверка на то что введена цифра в формате double, если это не так, то выдается ошибка.
                    // Замена a=scan.nextDouble();. Запятая меняется на точку для корректного парсинга строки ввода с консоли
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат данных");
                }
            }
            while (true) {
                try {
                    System.out.println("Введите число b");
                    b = Double.parseDouble(scan.next().replace(',','.')); // Добавлена проверка на то что введена цифра в формате double, если это не так, то выдается ошибка.
                    // Замена b = scan.nextDouble();. Запятая меняется на точку для корректного парсинга строки ввода с консоли
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат данных");
                }
            }
        }

        /**
         * @param scan экземпляр класса Scanner с помощью данного параметра считываются данные из консоли
         * Метод operation позволяет вводить операцию и выполнять ее над введенными ранее числами a и b
         */
        private void operation(Scanner scan) {
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
    private static class MaxArray {
        int i, j;
        String[] array;
        private MaxArray(Scanner scan) {
            System.out.println("Задайте размер массива ");
            i = scan.nextInt();
            array = new String[i];

            for (j = 0; j < i; j++) {
                System.out.println("Введите значение элемента массив с номером (без пробелом) " + j);
                String n = scan.next();
                array[j] = n;
            }
            // Использовался для тестирования String g = Arrays.toString(array);
            // Использовался для тестирования  System.out.println("массив: "+g);
        }

        /**
         *   Метод maxOperation позволяет находить максимум массива
         */
        private void maxOperation() {
            String currentWord = "";
            for(int j = 0; j < i; j++) {
                if(currentWord.length() < array[j].length())
                    currentWord  = array [j];
            }
            System.out.println("Самое длинное слово: " + currentWord);

        }
    }
}