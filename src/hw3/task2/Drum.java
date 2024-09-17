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
public class Drum implements Instrument{

    private String model;
    private SizeType size;

    @Override
    public void play() {
        System.out.println("\nPlaying "+this.size.getSize() + " Drum "+this.model);
    }
}
