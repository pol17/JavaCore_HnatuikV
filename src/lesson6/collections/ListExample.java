package lesson6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void myMethod(List<Integer> args) { //создано для 21-й строки
    }

    public static void main(String[] args) {
        List<String> optionNames = new ArrayList<>();
        optionNames.add("Alex");
        optionNames.add("Olya");

        System.out.println(optionNames.contains("Alex"));
        System.out.println(optionNames.contains("Tanya"));

        //несколько примеров коллекций
        List<Integer> emptyList = Collections.EMPTY_LIST; //пустой лист
        myMethod(Collections.singletonList(35));
    }
}
