package hw2.task2;

import java.math.BigDecimal;

public class Main {

//    Створити та описати наступну їєрархію
//    PC-Laptop-Ultrabook
//    PC-Laptop- Workstation
//    Загальна кількість вкористаних класів - 4!

    public static void main(String[] args) {
        Workstation workstation = new Workstation("intel i7",16,
                "GTX 1060 Ti",1000,
                new BigDecimal("5.54341"),false,1000);

        Ultrabook ultrabook = new Ultrabook("x1",16,"3070",
                256,new BigDecimal("1.8"),true,
                new BigDecimal("2.256"));

        Laptop laptop = new Laptop("x2",8,"4090",512,
                new BigDecimal("2.2"),true);


        System.out.println(workstation.toString());
        System.out.println(ultrabook.toString());
        System.out.println(laptop.toString());

    }

}
