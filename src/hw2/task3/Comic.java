package hw2.task3;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Comic extends Book{

    private String painter;
    private boolean isColor;

    public Comic(String material, BigDecimal size, String author, int pages, String genre,String painter,boolean isColor) {
        super(material, size, author, pages, genre);
        this.painter = painter;
        this.isColor = isColor;
    }

    @Override
    public String toString() {
        return "Comic{" +
                "painter='" + painter + '\'' +
                ", isColor=" + isColor +
                '}' + super.toString();
    }
}
