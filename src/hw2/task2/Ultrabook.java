package hw2.task2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Ultrabook extends Laptop {

    private BigDecimal size;

    public Ultrabook(String processor, int RAM, String videoCard, int diskStorage,
                     BigDecimal weight,boolean keyboardLight,BigDecimal size){
        super(processor, RAM, videoCard, diskStorage, weight,keyboardLight);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "size=" + size +
                '}'+super.toString();
    }
}
