package dev.wpsjava.foundations.people;

import java.util.Objects;

public class Person {

    private final String name;
    private final int birthYear;

    public Person(String name, int birthYear) {
        this.name = Objects.requireNonNull(name);

        if (name.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }

        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }
}