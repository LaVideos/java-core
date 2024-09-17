package hw3.task1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book implements Printable{

    private String title;
    private String author;
    private String genre;
    private int pages;
    private BigDecimal price;

    @Override
    public void print() {
        System.out.println("\nTitle: " + this.title+"\nAuthor: " +
                this.author+"\nGenre: "+this.genre +"\nPages: " +
                this.pages+"\nPrice: " + this.price);
    }
}
