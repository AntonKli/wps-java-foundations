package dev.wpsjava.foundations.text;

import java.util.HashSet;
import java.util.Set;

public class TextUtils {

    /**
     * Entfernt alle Zeichen, die keine Buchstaben oder Leerzeichen sind.
     */
    public static String removeNonLetters(String text) {
        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                cleaned.append(c);
            }
        }

        return cleaned.toString();
    }

    /**
     * Zählt, wie viele unterschiedliche Wörter in einem Text vorkommen.
     */
    public static int countDistinctWords(String text) {
        // Sonderzeichen entfernen und alles kleinschreiben
        String clean = removeNonLetters(text).toLowerCase();

        // Text in Wörter aufteilen (Trennung an Leerzeichen)
        String[] words = clean.split("\\s+");

        // Set sammelt nur eindeutige Einträge
        Set<String> distinctWords = new HashSet<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                distinctWords.add(word);
            }
        }

        // Anzahl unterschiedlicher Wörter
        return distinctWords.size();
    }
}
