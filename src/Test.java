public class Test {

        String str1 = new String("Test1");
        String str2 = new String("Test2");
        int num = 5;

        public static void main( String[] args ) {
            Test app1 = new Test();
            Test app2 = new Test();
            System.out.println( app1.equals(app2) );
        }
    }

