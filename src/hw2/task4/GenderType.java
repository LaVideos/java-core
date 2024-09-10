package hw2.task4;

import lombok.Getter;

@Getter
public enum GenderType {
    MALE("male"), FEMALE("female");

    private final String gender;

    GenderType(String language) {
        this.gender = language;
    }

}
