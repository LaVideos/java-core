package hw4.task1;

import lombok.Getter;

@Getter
public enum GenderType {
    MALE("male"), FEMALE("female");

    private final String gender;

    GenderType(String language) {
        this.gender = language;
    }

}
