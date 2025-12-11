package dev.wpsjava.foundations.text;

public class TextUtilsTest {

    public static void main(String[] args) {
        testSimpleText();
        testEmptyText();
        testMixedCharacters();
    }

    // Vergleichsmethoden für konsistente Testausgaben
    private static void assertEquals(int expected, int actual, String testName) {
        if (expected != actual) {
            System.out.println("Fehler in " + testName +
                    ": erwartet " + expected + ", aber war " + actual);
        } else {
            System.out.println("OK    " + testName);
        }
    }

    // Test eines einfachen Textes mit Wiederholungen.
    // Groß-/Kleinschreibung und Satzzeichen dürfen das Ergebnis nicht verändern.
    private static void testSimpleText() {
        String text = "Hallo hallo, du hallo.";
        int result = TextUtils.countDistinctWords(text);

        assertEquals(2, result, "Einfacher Text mit Wiederholungen");
    }

    // Test für einen komplett leeren Text.
    // Erwartung: Kein Wort → Ergebnis 0.
    private static void testEmptyText() {
        String text = "";
        int result = TextUtils.countDistinctWords(text);

        assertEquals(0, result, "Leerer Text");
    }

    // Test mit Sonderzeichen und unregelmäßigen Abständen.
    // removeNonLetters soll nur gültige Wörter übrig lassen.
    private static void testMixedCharacters() {
        String text = "Hey!!! Wie?? läuft's   so--da??";
        int result = TextUtils.countDistinctWords(text);

        assertEquals(4, result, "Gemischte Zeichen, Wörter sollen korrekt erkannt werden");
    }
}
