package hw1.task2;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

//    - створити клас, який би описував подібні об'єкти
//    https://jsonplaceholder.typicode.com/posts/1
//    створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль

    public static void main(String[] args) {

        Post post1 = new Post(1,1,"Title1","Body1");
        Post post2 = new Post(2,2,"Title2","Body2");
        Post post3 = new Post(3,3,"Title3","Body3");
        Post post4 = new Post(4,4,"Title4","Body4");
        Post post5 = new Post(5,5,"Title5","Body5");

        ArrayList<Post> posts = new ArrayList<Post>();
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);

        for (Object o : posts) {
            System.out.println(o.toString());
        }

    }
}
