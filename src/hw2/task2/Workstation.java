package hw2.task2;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
public class Workstation extends Laptop{
    private int power;

    public Workstation(String processor, int RAM, String videoCard, int diskStorage,
                       BigDecimal weight, boolean keyboardLight, int power) {
        super(processor, RAM, videoCard, diskStorage, weight, keyboardLight);
        this.power = power;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "power=" + power +
                '}' + super.toString();
    }
}
