package hw5.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

//    - Створити масив з 20 числами.
//- за допомогою способу sorted відсортувати масив.
//            -- за допомогою filter отримати числа кратні 3
//            -- за допомогою filter отримати числа кратні 10
//            -- перебрати (проітерувати) масив за допомогою foreach()
//            -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);

        numbers.stream().filter(n->n%3==0).forEach(System.out::println);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/");
        numbers.stream().filter(n->n%10==0).forEach(System.out::println);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/");
        numbers.forEach(System.out::println);
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/");
        List<Integer> numbers2 = numbers.stream().map((n) -> n * 3).toList();
        System.out.println(numbers2);

    }
}
