package eu.academy.test;

import java.time.LocalDate;

public class Person {
    private String officailId;
    private final String name;
    private final LocalDate birthDate;
    private final Gender gender;

    public Person(String name, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getOfficailId() {
        return officailId;
    }

    public void setOfficailId(String officailId) {
        this.officailId = officailId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }
}
