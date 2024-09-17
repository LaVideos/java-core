package hw5.task3;

//    Створити клас автомобіля з полями:
//    Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//    Власник автомобіля теж має бути обєкт, у якого є поля
//    Імя, вік, стаж водіння.

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model;
    private int year;
    private double power;
    private BigDecimal price;
    private CarOwner owner;

    @Override
    public String toString() {
        return "Car [model=" + this.model + ", year=" + this.year + ", power=" +(int) this.power + ", price=" + this.price + ", owner=" + this.owner + "]";
    }
}
