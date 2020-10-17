import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
    /**
     * * Задание №6
     * @author Evgenii-Mikhin
     * Есть входной файл с набором слов, написанных через пробел
     * Необходимо:
     * Прочитать слова из файла.
     * Отсортировать в алфавитном порядке.
     * Посчитать сколько раз каждое слово встречается в файле.
     * Вывести статистику на консоль
     * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
     */
    public class Task_6 {
        public static void main(String[] args) {
            Scanner scan = null;
            try {
                scan = new Scanner(new File("src\\main\\java\\Task_6_text\\MnM.txt")); //считывание файла
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Map<String, Integer> wordsNumbers = new TreeMap<>(); // Подсчет и сортировка слов в алфавитном порядке
            List<String> maxWords = new ArrayList<>();  // Хранение повторяющихся слов. На случай нескольких вариантов  создан список
            Integer maxNumber = 0;
            Boolean fileIsEmpty = true; // Задание метки пустого файла. По умолчанию он пустой (=true)

            while (scan.hasNext()) {
                String currentWord = scan.useDelimiter("\\s+").next();   //При обработке текщего слова считать пробел разделителем и переходить к следующему слову
                currentWord = currentWord.toLowerCase();    //Приведение слова к нижнему регистру
                fileIsEmpty = false;
                Integer countWord = wordsNumbers.get(currentWord);// Подсчет слов
                if (countWord == null) {
                    countWord = 0;
                }
                wordsNumbers.put(currentWord, ++countWord);
                if (maxNumber < countWord) {   // Поиск наиболе часто встречающихся слов
                    maxNumber = countWord;
                    maxWords.clear();
                    maxWords.add(currentWord);
                } else if (maxNumber.equals(countWord)) {
                    maxWords.add(currentWord);
                }
            }

            if (!fileIsEmpty) {
                System.out.println("Список находящихся в файле слов в алфавитном порядке:");
                System.out.println(wordsNumbers);
                System.out.printf("Наиболее часто встречается слово: %s.\n", maxWords);
                System.out.printf("Количество повторений: %d.\n", maxNumber);
            }

            scan.close();
        }
    }

