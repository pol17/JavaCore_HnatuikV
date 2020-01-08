package lesson5;

public class Dog extends Animal implements Swim { //через implements наделяем собаку способностью плавать
    private String animalName = "Dog";

    //создаем конструктор
    public Dog(int weight, String color) {
        super.animalName = this.animalName; //через super обращаемся к родительскому классу
        super.weight = weight;
        super.color = color;
    }

    @Override //переопределяем метод
    public void move(int direction) {
        System.out.printf("%s will move to house in direction %d \n", this.animalName, direction);
    }

    @Override //переопределяем метод
    public void swim() {
        System.out.println(this.animalName + " is swimming");
    }
}
