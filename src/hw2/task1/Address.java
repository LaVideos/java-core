package hw2.task1;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    private String street;
    private String city;
    private String suite;
    private String zipcode;
    private GEO geo;
}
