package dev.wpsjava.foundations.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Kleine Hilfsklasse für Listen-Funktionen.
 */
public class ListReverser {

    /**
     * Dreht die Reihenfolge der Elemente in einer Liste um.
     *
     * @param original ursprüngliche Liste (darf auch null sein)
     * @param <T>      Typ der Listenelemente
     * @return neue Liste mit umgekehrter Reihenfolge,
     *         das Original bleibt unverändert
     */
    public static <T> List<T> reverse(List<T> original) {
        // null-sicher: statt null eine leere Liste zurückgeben
        if (original == null) {
            return List.of();
        }

        // Kopie anlegen, damit die übergebene Liste nicht verändert wird
        List<T> copy = new ArrayList<>(original);

        // Reihenfolge in der Kopie umdrehen
        Collections.reverse(copy);

        return copy;
    }
}
