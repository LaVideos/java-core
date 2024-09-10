package hw1.task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

//    - закінчити опис класів Car,Dog,Book (файли знаходяться в цій папці)
//    створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("BMW");
        car1.setPower(new BigDecimal("300.333"));
        car1.setTurbo(false);
        car1.setVolumeEngine(new BigDecimal("5.4"));

        Car car2 = new Car("Toyota",false,new BigDecimal("269.32"),new BigDecimal("6.66"));
        Car car3 = new Car("Ferari",true,new BigDecimal("369.32"),new BigDecimal("7.56"));
        Car car4 = new Car("Tesla",false,new BigDecimal("240.5"),new BigDecimal("5.89"));
        Car car5 = new Car("Mersedes",false,new BigDecimal("280.5"),new BigDecimal("6.12"));

        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        for (Object o : cars) {
            System.out.println(o.toString());
        }

        Dog dog1 = new Dog("Nancy");
        Dog dog2 = new Dog("Toast", (byte) 5,"no data");
        Dog dog3 = new Dog("Chop", (byte) 5,"Mops");
        Dog dog4 = new Dog("Muhtar", (byte) 5,"German Shepard");
        Dog dog5 = new Dog("Kitty");

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        for (Object o : dogs) {
            System.out.println(o.toString());
        }

        Book book = new Book("Kike de",
                new ArrayList<String>(Arrays.asList("Xin Chao","Nikuto Daruto")),
                345,
                new ArrayList<String>(Arrays.asList("drama","romantic")));

        Book book1 = new Book("Monster",
                new ArrayList<String>(Arrays.asList("Jake Groul")),
                432,
                new ArrayList<String>(Arrays.asList("drama","criminal","thriller")));

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book);
        books.add(book1);

        for (Object o : books) {
            System.out.println(o.toString());
        }
    }
}
