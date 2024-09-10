package hw2.task3;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Magazine extends Book {

    private boolean subscription;

    public Magazine(String material, BigDecimal size, String author, int pages,String genre,boolean subscription) {
        super(material, size, author, pages,genre);
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "subscription=" + subscription +
                '}' + super.toString();
    }
}
