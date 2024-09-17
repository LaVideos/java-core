package hw3.task1;

import java.math.BigDecimal;
import java.util.List;

public class Main {

//    а) Оприділити інтерфейс Printable, який містить метод void print().
//    б) Оприділити клас Book, що реалізує інтерфейс Printable.
//    в) Оприділити клас Magazine, що реалізує інтерфейс Printable.
//    г) Створити масив типу Printable, який буде містити книги та журнали.

    public static void main(String[] args) {


        Book book = Book.builder().title("TNT").author("JAMAL").price(new BigDecimal("20.99")).genre("Romantic").pages(359).build();
        Book book2 = Book.builder().title("Fail").author("Y").price(new BigDecimal("12.99")).genre("Detective").pages(322).build();
        Magazine magazine = Magazine.builder().title("Fashion").price(new BigDecimal("5.50")).page(34).publisher("GaryCon").build();
        Magazine magazine2 = Magazine.builder().title("Cooking").price(new BigDecimal("1.99")).page(67).publisher("ChickenFaCo").build();

        List<Printable> books = List.of(book, book2, magazine, magazine2);

        for (Printable b : books) {
            b.print();
        }





    }

}
