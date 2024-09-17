package hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guitar implements Instrument{

    private String model;
    private int numOfStrings;


    @Override
    public void play() {
        System.out.println("\nPlaying Guitar " +this.model+" with "+this.numOfStrings+" Strings");
    }
}
