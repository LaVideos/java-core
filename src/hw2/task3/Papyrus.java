package hw2.task3;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Papyrus {
    private String material;
    private BigDecimal size;
}
