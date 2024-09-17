package hw4.task3;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private int id;
    private String name;
    private int age;
    private String surname;
    private String email;
    private GenderType gender;
    private List<Skill> skills;

}
