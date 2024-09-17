package hw3.task2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

//    Створити інтерфейс Instrument та реалізовуючі його класи "Гітара", "Барабан"  та "Труба" .
//    Інтерфейс Instrument  містить метод play().
//    Клас "Гітара" містить змінну класу "кількістьСтрун",
//    клас "Барабан" - розмір, а клас "Труба" - діаметр.
//    Створити масив типу "Інструмент" (Instrument), що містить інструменти різних типів.
//    У циклі викликати метод play() для кожного інструменту,
//    який повинен виводити рядок "Грає такий-то інструмент з такими-то характеристиками".

    public static void main(String[] args) {

        Guitar guitar = Guitar.builder().model("Stringo").numOfStrings(6).build();
        Guitar guitar2 = Guitar.builder().model("RAY").numOfStrings(4).build();
        Guitar guitar3 = Guitar.builder().model("Libra").numOfStrings(8).build();

        Drum drum = Drum.builder().model("Big Ick Randy").size(SizeType.EXTRALARGE).build();
        Drum drum2 = Drum.builder().model("Stone&Boner").size(SizeType.MEDIUM).build();
        Drum drum3 = Drum.builder().model("Historical African").size(SizeType.SMALL).build();

        Tube tube = Tube.builder().model("Saxofon").diameter(new BigDecimal("40.5")).build();
        Tube tube2 = Tube.builder().model("ne Saxofon").diameter(new BigDecimal("10.5")).build();
        Tube tube3 = Tube.builder().model("Sopilka").diameter(new BigDecimal("2.5")).build();


        List<Instrument> instruments = new ArrayList<>();

        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(tube3);
        instruments.add(drum3);
        instruments.add(guitar2);
        instruments.add(tube2);
        instruments.add(drum2);
        instruments.add(guitar3);
        instruments.add(tube);

        for (Instrument i : instruments) {
            i.play();
        }



    }
}
