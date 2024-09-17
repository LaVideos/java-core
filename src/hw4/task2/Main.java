package hw4.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

//    створити ArrayList зі словами на 15-20 елементів.
//- відсортувати його за алфавітом .

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("grayson");
        words.add("abricos");
        words.add("accept");
        words.add("elli");
        words.add("barabura");
        words.add("frank");
        words.add("clint");
        words.add("eastwood");
        words.add("dave");
        words.add("word");
        words.add("fuel");
        words.add("elleanora");
        words.add("totoro");
        words.add("ollie");
        words.add("tarantino");
        words.add("kubrick");
        words.add("martin");

        List<String> wordsByAZ = words.stream().sorted().toList();
        System.out.println(wordsByAZ);

    }
}
