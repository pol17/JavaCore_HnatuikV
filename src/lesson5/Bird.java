package lesson5;

public class Bird extends Animal implements Fly { //через implements наделяем птицу способностью летать
    private String animalName = "Bird";

    //создаем конструктор
    public Bird(int weight, String color) {
        super.animalName = this.animalName; //через super обращаемся к родительскому классу
        super.weight = weight;
        super.color = color;
    }

    @Override //переопределяем метод
    public void move(int direction) {
        System.out.printf("%s will move in direction %d \n", this.animalName, direction);
    }

    @Override //переопределяем метод
    public void fly() {
        System.out.println(this.animalName + " is flying");
    }
}