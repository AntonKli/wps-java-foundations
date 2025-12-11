package dev.wpsjava.foundations.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverser {

    // Dreht die Reihenfolge einer Liste um, ohne das Original zu verändern.
    // Wenn null übergeben wird, geben wir eine leere Liste zurück,
    // damit keine NullPointerException entsteht.
    public static <T> List<T> reverse(List<T> original) {
        if (original == null) {
            return List.of();
        }

        // Kopie der Liste erstellen, damit die ursprüngliche Liste unverändert bleibt.
        List<T> copy = new ArrayList<>(original);

        // Reihenfolge der Elemente in der Kopie umdrehen.
        Collections.reverse(copy);

        // Ergebnis zurückgeben.
        return copy;
    }
}
