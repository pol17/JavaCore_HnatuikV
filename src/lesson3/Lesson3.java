package lesson3;

public class Lesson3 {
    private String defaultName;

    public Lesson3(String name) {
        this.defaultName = name;
    }

    /**
     * My method doing...
     * @param a - any number
     * @param b - number name
     * @return - summary
     */

    int sum (int a, String b) {
        System.out.println("Sum executed for " + this.defaultName);
        return a;
    }

    public static void main(String[] args) {
        Lesson3 myObject = new Lesson3("Nik");
        int result = myObject.sum(17, "");
        System.out.println(result);
    }
}
