package lesson2.oop.inheritance;

public class Sedan extends Car {
    private String sedanSound = "Kwa-Kwa";

    @Override
    public void beep() {
        System.out.println(sedanSound);
    }
}
