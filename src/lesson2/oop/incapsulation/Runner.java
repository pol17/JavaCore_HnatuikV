package lesson2.oop.incapsulation;

public class Runner {
    public static void main(String[] args) {
        IncapsulatedVariables myObject = new IncapsulatedVariables();

        System.out.println("My object char: " + myObject.getA());
        myObject.setA(55);
        System.out.println("My A after setting: " + myObject.getA());

    }
}
