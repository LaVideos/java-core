package hw5.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    створити ArrayList зі словами на 15-20 елементів.
//- відсортувати його за алфавітом .
//            *-- відфільтрувати слова довжиною менше 4 символів
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("Grayson");
        words.add("abricos");
        words.add("accept");
        words.add("Elli");
        words.add("Barabura");
        words.add("Frank");
        words.add("an");
        words.add("Clint");
        words.add("Eastwood");
        words.add("dave");
        words.add("word");
        words.add("fuel");
        words.add("Elleanora");
        words.add("Totoro");
        words.add("in");
        words.add("Ollie");
        words.add("Tarantino");
        words.add("Kubrick");
        words.add("Martin");
        words.add("big");

        words.stream().sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/");

        words.stream().sorted(String.CASE_INSENSITIVE_ORDER).filter((word) -> word.length() >= 4).forEach(System.out::println);

    }
}
