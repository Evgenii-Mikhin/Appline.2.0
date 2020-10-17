import Task_5_CalculatorOOP.Operation;
import Task_5_CalculatorOOP.UserNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
/**
 * Задание №8.
 *
 * @author Evgenii-Mikhin
 * Покрыть Unit тестами последний проект с калькулятором
 */

    public class CalculatorTest {
        private final ByteArrayOutputStream outContest = new ByteArrayOutputStream();
        private String fileRoot = "src\\main\\java\\Task_8_text\\";

        @Before
        public void setUpStream() {
            System.setOut(new PrintStream(outContest));
        }

        @After
        public void cleanUpStream() {
            System.setOut(null);
        }

        @Test
        public void testSelectOperationPozitivePlus() {
            Scanner scan = null;
            try {
                scan = new Scanner(new File(fileRoot + "operationPlus.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            char oper = scan.next().charAt(0);
            Operation operation = new Operation(scan);
            operation.setOper(oper);
            String expectedResult = "Операция принята";

            scan.close();
            assertEquals("Значения не совпадают.", expectedResult, outContest.toString());
        }
        @Test
        public void testSelectOperationPozitiveMinus() {
            Scanner scan = null;
            try {
                scan = new Scanner(new File(fileRoot + "operationMinus.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            char oper = scan.next().charAt(0);
            Operation operation = new Operation(scan);
            operation.setOper(oper);
            String expectedResult = "Операция принята";

            scan.close();
            assertEquals("Значения не совпадают.", expectedResult, outContest.toString());
        }
        @Test
        public void testSelectOperationPozitiveSplit() {
            Scanner scan = null;
            try {
                scan = new Scanner(new File(fileRoot + "operationSplit.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            char oper = scan.next().charAt(0);
            Operation operation = new Operation(scan);
            operation.setOper(oper);
            String expectedResult = "Операция принята";

            scan.close();
            assertEquals("Значения не совпадают.", expectedResult, outContest.toString());
        }
        @Test
        public void testSelectOperationPozitiveMultiply() {
            Scanner scan = null;
            try {
                scan = new Scanner(new File(fileRoot + "operationMultiply.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            char oper = scan.next().charAt(0);
            Operation operation = new Operation(scan);
            operation.setOper(oper);
            String expectedResult = "Операция принята";

            scan.close();
            assertEquals("Значения не совпадают.", expectedResult, outContest.toString());
        }
        @Test
        public void testSelectOperationNegativeLetter() {
            Scanner scan = null;
            try {
                scan = new Scanner(new File(fileRoot + "operationNegativeLetter.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            char oper = scan.next().charAt(0);
            Operation operation = new Operation(scan);
            operation.setOper(oper);
            String expectedResult = "Такая операция не реализована";

            scan.close();
            assertEquals("Значения не совпадают.", expectedResult, outContest.toString());
        }
        @Test
        public void testSelectOperationNegativeNumber() {
            Scanner scan = null;
            try {
                scan = new Scanner(new File(fileRoot + "operationNegativeNumber.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            char oper = scan.next().charAt(0);
            Operation operation = new Operation(scan);
            operation.setOper(oper);
            String expectedResult = "Такая операция не реализована";

            scan.close();
            assertEquals("Значения не совпадают.", expectedResult, outContest.toString());
        }
        @Test
        public void testSelectUserNumber() {
            Scanner scan = null;
            try {
                scan = new Scanner(new File(fileRoot + "NumberInputTest.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

           double num = Double.parseDouble(scan.next());
            UserNumber userNumber = new UserNumber(scan);
            userNumber.setNumber(num);

            String expectedResult = "";

            scan.close();
            assertEquals("Значения не совпадают.", expectedResult, outContest.toString());
        }
        @Test
        public void DottedNumberInputTest() {
            Scanner scan = null;
            try {
                scan = new Scanner(new File(fileRoot + "DottedNumberInputTest.txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            double num = Double.parseDouble(scan.next());
            UserNumber userNumber = new UserNumber(scan);
            userNumber.setNumber(num);

            String expectedResult = "";

            scan.close();
            assertEquals("Значения не совпадают.", expectedResult, outContest.toString());
        }
        }
