package dev.wpsjava.foundations.text;

import java.util.HashSet;
import java.util.Set;

public class TextUtils {

    // Entfernt alle Zeichen, die keine Buchstaben oder Leerzeichen sind.
    public static String removeNonLetters(String text) {
        StringBuilder cleaned = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Nur Buchstaben und Leerzeichen behalten
            if (Character.isLetter(c) || Character.isWhitespace(c)) {
                cleaned.append(c);
            }
        }

        return cleaned.toString();
    }

    // Ermittelt die Anzahl unterschiedlicher Wörter im Text.
    public static int countDistinctWords(String text) {

        // Erst bereinigen und in Kleinbuchstaben bringen
        String clean = removeNonLetters(text).toLowerCase();

        // Text in einzelne Wörter zerlegen
        String[] words = clean.split("\\s+");

        // Set speichert automatisch nur eindeutige Werte
        Set<String> distinctWords = new HashSet<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                distinctWords.add(word);
            }
        }

        return distinctWords.size();
    }
}
