package hw5.task3;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarOwner extends Person {
    private int driveExperience;

    public CarOwner(String name, int age, int driveExperience) {
        super(name, age);
        this.driveExperience = driveExperience;
    }

    @Override
    public String toString() {
        return super.toString() + " driveExperience=" + driveExperience + "]";
    }
}
