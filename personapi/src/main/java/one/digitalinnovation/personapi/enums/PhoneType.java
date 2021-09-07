package one.digitalinnovation.personapi.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME ("Home"),
    MOBILE ("Mobile"),
    COMMERCIAL ("Conmercial");


    private final String description;


}
