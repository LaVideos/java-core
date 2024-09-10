package hw2.task3;

import java.math.BigDecimal;

public class Main {

//    Cтворити клас ланцюг наслідування:
//    Папірус-Кинга-Журнал
//    Папірус-Книга-Комікс
//    Кількість полів довільна.

    public static void main(String[] args) {

        Comic comic = new Comic("carton",new BigDecimal("20.25"),
                "Cool guy",189,"horror","Another guy",true);

        Magazine magazine = new Magazine("paper",new BigDecimal("25.30"),
                "hzzz",54,"cooking",true
                );

        Book book = new Book("paper",new BigDecimal("25.33"),
                "Tolkien",1054,"fantazy"
                );

        System.out.println(comic.toString());
        System.out.println(magazine.toString());
        System.out.println(book.toString());

    }
}
