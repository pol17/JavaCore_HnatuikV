package lesson5.interfaces;

public abstract class Animal {
    protected int weight;
    protected String color;
    protected String animalName;

    //передаем параметры в конструктор
    protected Animal(String name, int weight, String color) {
        this.animalName = name;
        this.weight = weight;
        this.color = color;
    }

    public Animal() {} //создали, чтоб не передавать параметры ниже (sleep, eat) в класс Cat

    //указываем, что наше животное будет делать за указанное время (спать)
    public void sleep(int time) {
        System.out.println(animalName + " (" + color + ") will sleep " + time + " ours");
    }

    //пишем, что произойдет, когда животное поест (наберет вес)
    public void eat(String foodName){
        this.weight = this.weight + 2;
        System.out.printf("%s will eat %s and will be %d kg \n", animalName, foodName, this.weight); //%s для String, %d для Number, а \n это как Enter
    }

    protected abstract void move(int direction); //создаем абстрактный метод (без логики); если хотя бы один класс абстрактный, то и основной должен быть таким же (вверху 3я строка)
}
