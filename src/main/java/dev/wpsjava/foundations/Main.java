package dev.wpsjava.foundations;

import dev.wpsjava.foundations.text.TextUtils;

public class Main {
    public static void main(String[] args) {
        String text = "Hallo hallo, du hallo.";

        int distinct = TextUtils.countDistinctWords(text);
        System.out.println("Unterschiedliche Wörter: " + distinct);
    }
}
