package hw1.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Comments comments1 = new Comments(1,1,"fuel.gmail.com","dsdsdsdssdsds");
        Comments comments2 = new Comments(1,2,"lol.gmail.com","ffefefeef");
        Comments comments3 = new Comments(1,3,"bruh.gmail.com","love");
        Comments comments4 = new Comments(2,1,"bruh.gmail.com","bruh");
        Comments comments5 = new Comments(3,2,"kek.gmail.com","bruh");

        ArrayList<Comments> comments = new ArrayList<Comments>();
        comments.add(comments1);
        comments.add(comments2);
        comments.add(comments3);
        comments.add(comments4);
        comments.add(comments5);

        for (Object o : comments) {
            System.out.println(o.toString());
        }


    }
}
