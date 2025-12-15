package dev.wpsjava.foundations.text;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TextUtils {

    // Entfernt alle Zeichen, die keine Buchstaben oder Leerzeichen sind
    public static String removeNonLetters(String text) {
        Objects.requireNonNull(text);

        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                cleaned.append(c);
            }
        }

        return cleaned.toString();
    }

    // Zählt die Anzahl unterschiedlicher Wörter im Text
    public static int countDistinctWords(String text) {
        Objects.requireNonNull(text);

        String clean = removeNonLetters(text).toLowerCase();
        String[] words = clean.split("\\s+");

        Set<String> distinct = new HashSet<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                distinct.add(word);
            }
        }

        return distinct.size();
    }
}
