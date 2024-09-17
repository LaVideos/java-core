package hw3.task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable{

    private String title;
    private String publisher;
    private BigDecimal price;
    private int page;



    @Override
    public void print() {
        System.out.println("\nTitle: " + this.title+"\nPublisher: " +
                this.publisher+"\nPages: "+ this.page+"\nPrice: " +
                this.price);
    }
}
