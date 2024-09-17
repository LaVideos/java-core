package hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tube implements Instrument{

    private String model;
    private BigDecimal diameter;



    @Override
    public void play() {
        System.out.println("\nPlaying Tube "+ this.model+" with "+this.diameter+" diameter");
    }
}
