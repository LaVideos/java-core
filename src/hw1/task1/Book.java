package hw1.task1;

import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<String> authors;
    private int pages;
    private ArrayList<String> genres;


    public Book(String title, ArrayList<String> authors, int pages, ArrayList<String> genres) {
        this.title = title;
        this.authors = authors;
        this.pages = pages;
        this.genres = genres;
    }

    public Book(){}

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", pages=" + pages +
                ", genres=" + genres +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }


}
