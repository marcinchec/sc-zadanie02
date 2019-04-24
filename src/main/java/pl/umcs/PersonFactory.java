package pl.umcs;

public class PersonFactory {

    public static Person createPerson(String firstName, String lastName, Integer age) {
        return Person.builder()
                .firstName(firstName)
                .lastName(lastName)
                .age(age)
                .build();
    }
}
