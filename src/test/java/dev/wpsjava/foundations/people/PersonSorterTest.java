package dev.wpsjava.foundations.people;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonSorterTest {

    @Test
    void sortsByBirthYearAscending() {
        // ARRANGE
        Person p1 = new Person("Anna", 1992);
        Person p2 = new Person("Ben", 1988);
        Person p3 = new Person("Clara", 2001);

        List<Person> input = List.of(p1, p2, p3);

        // ACT
        List<Person> result = PersonSorter.sort(input);

        // ASSERT
        assertEquals(List.of(p2, p1, p3), result);
    }

    @Test
    void sortsByNameWhenBirthYearIsEqual() {
        // ARRANGE
        Person p1 = new Person("Ben", 1990);
        Person p2 = new Person("Anna", 1990);
        Person p3 = new Person("Clara", 1990);

        List<Person> input = List.of(p1, p2, p3);

        // ACT
        List<Person> result = PersonSorter.sort(input);

        // ASSERT
        assertEquals(List.of(p2, p1, p3), result);
    }

    @Test
    void doesNotModifyOriginalList() {
        // ARRANGE
        Person p1 = new Person("Anna", 1992);
        Person p2 = new Person("Ben", 1988);

        List<Person> input = List.of(p1, p2);

        // ACT
        List<Person> result = PersonSorter.sort(input);

        // ASSERT
        assertEquals(List.of(p1, p2), input);
        assertNotSame(input, result);
    }

    @Test
    void nullInputThrowsNullPointerException() {
        // ACT & ASSERT
        assertThrows(NullPointerException.class, () -> PersonSorter.sort(null));
    }
}
