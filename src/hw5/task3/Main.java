package hw5.task3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

//    Це абстрактне завдання, в якого ыснуэ 100500 способів вирішення,
//    тому його сприймате просто як список можливих варіацій бізнес процесів.
//            Вважайте, що тут нема правильної відповіді
//
//    Створити клас автомобіля з полями:
//    Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//    Власник автомобіля теж має бути обєкт, у якого є поля
//    Імя, вік, стаж водіння.
//    Створити не менше 7 та не більше 20 машинок.
//    Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//    Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//    Якщо досвід водія менший за 5 років, але його вік більший за 25,
//    то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//    Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//    Все через stream API

    public static void main(String[] args) {

        Car car = Car.builder().model("Porsche")
                .owner(new CarOwner("Randy Marsh",44,30))
                .power(255).price(new BigDecimal("1")).year(2023).build();

        Car car1 = Car.builder().model("Horse")
                .owner(new CarOwner("Jack the Lighter", 300,294 ))
                .power(100).price(new BigDecimal("1")).year(1733).build();

        Car car2 = Car.builder().model("Mercedes").owner(new CarOwner("Stan",20,1))
                .power(235).price(new BigDecimal("1")).year(2018).build();

        Car car3 = Car.builder().model("Optimus Prime").year(-6600000).owner(new CarOwner("Monkey",16,0))
                .power(9999999).price(new BigDecimal("1")).build();

        Car car4 = Car.builder().model("SUBARU").price(new BigDecimal("1"))
                .power(185).year(2010).owner(new CarOwner("1",24,6)).build();

        Car car5 = Car.builder().model("O").owner(new CarOwner("Q",29,3))
                .year(2020).power(330).price(new BigDecimal("1")).build();

        Car car6 = Car.builder().model("J").price(new BigDecimal("1")).power(90).year(2000)
                .owner(new CarOwner("J", 46,2)).build();

        Car car7 = Car.builder().model("K").price(new BigDecimal("1")).power(10).year(1909)
                .owner(new CarOwner("D", 19,10)).build();

        Car car8 = Car.builder().model("a").price(new BigDecimal("1")).power(1022).year(2009)
                .owner(new CarOwner("s", 31,5)).build();


        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car8);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car1);
        cars.add(car7);

        cars.stream().forEach(System.out::println);

        System.out.println("////////////////////////////////////////////////");
        cars.stream().limit(cars.size()/2).forEach(c->{
            c.setPower(c.getPower()*1.1);
        });

        cars.stream()
                .filter(c->c.getOwner().getDriveExperience()<5
                        && c.getOwner().getAge()>25)
                .forEach(c->c.getOwner().setDriveExperience(c.getOwner().getDriveExperience()+1));

        BigDecimal sum = cars.stream().map(Car::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);

        cars.forEach(System.out::println);
        System.out.println("sum: " + sum);


    }
}
