package hw2.task1;

import java.math.BigDecimal;

public class Main {

//    створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
//    https://jsonplaceholder.typicode.com/users/1

    public static void main(String[] args) {

        User user = new User(1,"John Doe",
                "lost","LikeToHide@gmail.com",
                "3/4 avenue","New Londonyork",
                "hzz", "233-33.2",new GEO(new BigDecimal("-22.2222"),new BigDecimal("21.1212")),
                "0783323112","https//iamlost.com",new Company("xd","xd2","xd3"));


        System.out.println(user.toString());

    }
}
