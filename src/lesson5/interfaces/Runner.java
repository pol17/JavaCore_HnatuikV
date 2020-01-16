package lesson5.interfaces;

public class Runner {
    public static void main(String[] args) {
        /*Animal animal = new Animal("It", 4, "Black");
        animal.sleep(6);
        animal.eat("Mouse");*/

        Cat cat = new Cat(10, "White");
        cat.eat("Meat");
        cat.eat("Fish");
        cat.sleep(2);
        cat.sleep("Chair");

        Dog dog = new Dog(20, "Brown");
        dog.eat("Bone");
        dog.sleep(4);
        dog.move(4);
        dog.swim();

        Bird bird = new Bird(1, "Blue");
        bird.eat("Bread");
        bird.sleep(1);
        bird.move(3);
        bird.fly();
    }
}
