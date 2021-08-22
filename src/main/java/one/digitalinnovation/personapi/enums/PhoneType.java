package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    NOME("home"),
    MOBILE("mobile"),
    COMMERCIAL("commercial");

    private final String description;
}
