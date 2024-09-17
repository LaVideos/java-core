package hw4.task4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder(builderMethodName = "internalBuilder")
public class Person {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.id = ++idCounter;
        this.name = name;
        this.surname = surname;
    }

    public Person() {
        this.id = ++idCounter;
    }

    public static PersonBuilder builder() {
        return internalBuilder().id(++idCounter);
    }
}
