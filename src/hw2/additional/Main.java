package hw2.additional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Comment comment1 = new Comment(1, 1, "user1@gmail.com", "cool");
        Comment comment2 = new Comment(2, 2, "user2@gmail.com", "wow");
        Comment comment3 = new Comment(1, 3, "user3@gmail.com", "heheh");
        Comment comment4 = new Comment(3, 4, "user4@gnail.com", "nie pro");
        Comment comment5 = new Comment(2, 5, "user5@gmail.com", "####");
        Comment comment6 = new Comment(1, 6, "user6@gmail.com", ")))))))");
        Comment comment7 = new Comment(3, 7, "user7@gmeil.com", "cscjncsjcsbjbjhkbjk");

        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);
        comments.add(comment4);
        comments.add(comment5);
        comments.add(comment6);
        comments.add(comment7);


        Post post1 = new Post(1, 1, "1", "post#1");
        Post post2 = new Post(2, 2, "2", "post#2");
        Post post3 = new Post(3, 3, "3", "post#3");

        post1.selectComments(comments);
        post2.selectComments(comments);
        post3.selectComments(comments);

        System.out.println(post1.toString());
        System.out.println(post2.toString());
        System.out.println(post3.toString());

    }
}
