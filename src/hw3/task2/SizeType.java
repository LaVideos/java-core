package hw3.task2;

import lombok.Getter;

@Getter
public enum SizeType {

    SMALL("small"),MEDIUM("medium"),LARGE("large"),EXTRALARGE("extra-large");

    private final String size;

    SizeType(String size) {
        this.size = size;
    }
}
