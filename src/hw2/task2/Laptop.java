package hw2.task2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Laptop extends PC {
    private BigDecimal weight;
    private boolean keyboardLight;

    public Laptop(String processor, int RAM, String videoCard, int diskStorage,BigDecimal weight,boolean keyboardLight){
        super(processor, RAM, videoCard, diskStorage);
        this.weight = weight;
        this.keyboardLight = keyboardLight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", keyboardLight=" + keyboardLight +
                '}'+super.toString();
    }
}
