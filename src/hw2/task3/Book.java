package hw2.task3;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Book extends Papyrus {
    private String author;
    private int pages;
    private String genre;

    public Book(String material, BigDecimal size,String author, int pages, String genre) {
        super(material, size);
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                ", genre='" + genre + '\'' +
                '}' + super.toString();
    }
}
