package dev.wpsjava.foundations;

import dev.wpsjava.foundations.text.TextUtils;

// Kleines Beispielprogramm zum Testen der TextUtils-Funktionen.
public class Main {
    public static void main(String[] args) {
        String text = "Dies ist ein kleiner Beispieltext, ein sehr kleiner Text.";

        int distinct = TextUtils.countDistinctWords(text);
        System.out.println("Anzahl unterschiedlicher Wörter: " + distinct);
    }
}
