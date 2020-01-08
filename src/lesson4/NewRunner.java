package lesson4;

public class NewRunner {
    public static void main(String[] args) {
    }
    int a = 5;
    public static void sum(int a, int b) {
        int notEmpty = 0;
        if(a != notEmpty && b == 1) {
            System.out.println(a + b);
        }
        sum(23, 1);

        String myString1 = "sometext";
        String myString2 = "sometext";
        int myInt1 = 2;
        int myInt2 = 2;

        if(myInt1 == myInt2) {
            System.out.println("Ints sre equal");
        }

        if(myString1 == myString2) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
