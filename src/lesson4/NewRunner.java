package lesson4;

public class NewRunner {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int notEmpty = 0;
        if (a != notEmpty && b == 4) {
            System.out.println("Sum is " + (a + b));
        }

        String myString1 = "text1";
        String myString2 = "text2";
        int myInt1 = 2;
        int myInt2 = 2;

        if (myInt1 == myInt2) {
            System.out.println("Ints are equal"); //выполняется if потому, что myInt1 равен myInt2 (2 = 2)
        } else {
            System.out.println("Ints are not equal");
        }

        if (myString1 == myString2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal"); //выполняется else потому, что myString1 не равен myString2 (text1 != text2)
        }
    }
}
