package hw4.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {


//    Створити List Юзерів
//- відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//- відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
    public static void main(String[] args) {

        User user1 = new User(1,"Jay",24,"Jackson","jj@mail.com",GenderType.MALE);
        User user6 = new User(5,"Kenny",8,"s","@mail.com",GenderType.MALE);
        User user2 = new User(2,"Jasmine",17,"Min","minKchay@mail.com",GenderType.FEMALE);
        User user3 = new User(3,"Kyle",9,"Broflowsi","jew@mail.com",GenderType.MALE);
        User user4 = new User(4,"Stanford",10,"Marsh","marsh@mail.com",GenderType.MALE);
        User user5 = new User(5,"Eric",9,"Cartman","cartman@mail.com",GenderType.MALE);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);


        List<User> usersByAgeUp = users.stream().sorted(Comparator.comparingInt(User::getAge)).toList();
        System.out.println(usersByAgeUp+"\n");

        List<User> usersByAgeDown = users.stream().sorted(Comparator.comparingInt(User::getAge).reversed()).toList();
        System.out.println(usersByAgeDown+"\n");

        List<User> userNameLengthByRaising = users.stream().sorted(Comparator.comparing(user -> user.getName().length())).toList();
        System.out.println(userNameLengthByRaising+"\n");

        List<User> userNameLengthDescending = users.stream()
                .sorted(Comparator.comparing(user -> user.getName().length(), Comparator.reverseOrder()))
                .toList();
        System.out.println(userNameLengthDescending);


    }
}
