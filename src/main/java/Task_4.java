import java.util.Arrays;
import java.util.Random;
/**
 * Задание №4
 *
 * @author Evgenii-Mikhin
 * 1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами.

 * 2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */
public class Task_4{
    private static void main(String[] args) {
        int[] array = new int[20]; // Создаем массив размерностью 20.

        for (int i = 0; i < 20; i++) // Заполнение массива i++ = x(Случайное число)
        {
            int x = getRandomDiceNumber();
            array[i] = x;
            // System.out.println(x);
        }
        System.out.println("Сформирован массив из случайных чисел от -10 до 10:");
        System.out.println(Arrays.toString(array));
        int minValue = array[0];
        int minPosition = 0;
        int maxValue = array[0];
        int maxPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <  minValue ) { //Определяем минимальное значение в массиве
                minValue = array[i];
                minPosition = i;
                // System.out.println("минимум" + minValue);
            }
            if (array[i] > maxValue ) {
                maxValue = array[i]; //Определяем максимальное значение в массиве
                maxPosition = i;
                //System.out.println("максимум" +maxValue);
            }
        }
        System.out.println(String.format("Минимальное значение массива - '%s'); \nМаксимальное значение массива - '%s'", minValue, maxValue));
        System.out.println("Меняем местами минимальное и максимальное значения в массиве:");
        array[minPosition] = maxValue;
        array[maxPosition] = minValue;

        System.out.println(Arrays.toString(array));
    }

    /**
     * Конструктор позволяет получить рандомные целые числа от 0 до 20.
     * В данном методе от полученного числа вычитается 10. для получения случайных чисел в диапозоне от -10 до 10.
     */
    private static int getRandomDiceNumber() //
    {
        return (int) ((Math.random() * 21)-10);
    }
}
