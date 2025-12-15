package dev.wpsjava.foundations.people;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class PersonSorter {

    private static final Comparator<Person> BY_BIRTHYEAR_THEN_NAME =
            Comparator.comparingInt(Person::getBirthYear)
                    .thenComparing(Person::getName);

    // Sortiert nach Geburtsjahr aufsteigend, bei Gleichstand nach Name
    // Gibt eine neue Liste zurück und verändert das Original nicht
    public static List<Person> sort(List<Person> people) {
        Objects.requireNonNull(people);

        List<Person> result = new ArrayList<>(people);
        result.sort(BY_BIRTHYEAR_THEN_NAME);

        return result;
    }
}
