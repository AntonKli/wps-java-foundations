package dev.wpsjava.foundations.people;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @Test
    void createsPerson_withValidValues() {
        // ARRANGE
        String name = "Anna";
        int birthYear = 1992;

        // ACT
        Person person = new Person(name, birthYear);

        // ASSERT
        assertEquals("Anna", person.getName());
        assertEquals(1992, person.getBirthYear());
    }

    @Test
    void throwsNullPointerException_whenNameIsNull() {
        // ACT & ASSERT
        assertThrows(NullPointerException.class, () -> new Person(null, 1990));
    }

    @Test
    void throwsIllegalArgumentException_whenNameIsEmpty() {
        // ACT & ASSERT
        assertThrows(IllegalArgumentException.class, () -> new Person("", 1990));
    }

    @Test
    void throwsIllegalArgumentException_whenNameIsBlank() {
        // ACT & ASSERT
        assertThrows(IllegalArgumentException.class, () -> new Person("   ", 1990));
    }
}
