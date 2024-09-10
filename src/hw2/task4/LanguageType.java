package hw2.task4;

import lombok.Getter;

@Getter
public enum LanguageType {
    JAVA("java"),
    CSHARP("c#"),
    CPLUSPLUS("c++"),
    JAVASCRIPT("javascript"),
    TYPESCRIPT("typescript"),
    PYTHON("python"),
    RUBY("ruby");


    private final String language;

    LanguageType(String language) {
        this.language = language;
    }

}
