package lesson5;

public class Cat extends Animal {
    private String animalName = "Cat";

    //создаем конструктор
    public Cat(int weight, String color) {
        super.animalName = this.animalName; //через super обращаемся к родительскому классу
        super.weight = weight;
        super.color = color;
    }

    @Override //переопределяем метод
    public void move(int direction) {
        System.out.printf("%s is going for a walk in direction %d", this.animalName, direction);
    }

    @Override //переопределяем родительский метод sleep (уникальное поведение sleep для кошки)
    public void sleep(int time) {
        System.out.println(this.animalName + " (" + this.color + ") won't sleep");
    }

    public void sleep(String place) {
        System.out.println(this.animalName + " (" + this.color + ") will sleep on " + place);
    }
}
