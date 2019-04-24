package pl.umcs;

import lombok.Builder;

@Builder
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
}
