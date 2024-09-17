package hw4.task1;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int id;
    private String name;
    private int age;
    private String surname;
    private String email;
    private GenderType gender;
}
