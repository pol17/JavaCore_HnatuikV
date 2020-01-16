package lesson6.generics;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        String text = list.get(0) + ", world!";
        System.out.print(text);

        //необходимость приведения типов, 1-й способ решения (ошибка покажет, что у нас Integer (123) не String)
        list.add(123);
        for (Object str : list) {
            System.out.println("-" + (String) str);
        } //ошибка, ведь лист содержит Integer

        //возможное исправление ошибки, 2-й способ решения (String соответствует String)
        for (Object str : list) {
            System.out.println(" - " + str + "!");
        }

        //использование generics, 3-й способ решения
        List<String> listGeneric = new ArrayList<>();
        //listGeneric.add(123); //ошибка на этапе компиляции, ведь 123 тут не String (если раскомментировать)
        for (Object str : listGeneric) {
            System.out.println("- " + str);
        }
    }
}
