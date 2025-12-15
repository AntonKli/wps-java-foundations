package dev.wpsjava.foundations.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListReverser {

    // Gibt eine neue Liste zurück, ohne das Original zu verändern
    public static <T> List<T> reverse(List<T> original) {
        Objects.requireNonNull(original);

        List<T> result = new ArrayList<>(original.size());

        for (int i = original.size() - 1; i >= 0; i--) {
            result.add(original.get(i));
        }

        return result;
    }
}
