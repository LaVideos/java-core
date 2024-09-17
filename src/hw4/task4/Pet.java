package hw4.task4;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder(builderMethodName = "internalBuilder")
public class Pet {
    private static int idCounter = 0;
    private int id;
    private String name;

    public Pet(String name) {
        this.id = ++idCounter;
        this.name = name;
    }

    public Pet() {
        this.id = ++idCounter;
    }

    public static PetBuilder builder() {
        return internalBuilder().id(++idCounter);
    }
}
