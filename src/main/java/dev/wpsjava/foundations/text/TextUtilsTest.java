package dev.wpsjava.foundations.text;

public class TextUtilsTest {

    public static void main(String[] args) {

        testSimpleText();
        testEmptyText();
        testMixedCharacters();
    }

    /**
     * Kleiner Hilfsmechanismus für Vergleichstests.
     * Gibt ein einheitliches OK/Fehler-Format aus,
     * damit man beim Durchlaufen der Tests direkt sieht,
     * welche Werte nicht stimmen.
     */
    private static void assertEquals(int expected, int actual, String testName) {
        if (expected != actual) {
            System.out.println("Fehler in " + testName +
                    ": erwartet " + expected + ", aber war " + actual);
        } else {
            System.out.println("OK    " + testName);
        }
    }

    /**
     * Testet einen einfachen Text mit Wiederholungen.
     * Erwartung: Groß-/Kleinschreibung und Satzzeichen
     * sollen das Ergebnis nicht verfälschen.
     */
    private static void testSimpleText() {
        String text = "Hallo hallo, du hallo.";
        int result = TextUtils.countDistinctWords(text);

        assertEquals(2, result, "Einfacher Text mit Wiederholungen");
    }

    /**
     * Testet das Verhalten bei einem komplett leeren String.
     * Erwartung: Es gibt keine Wörter → Ergebnis 0.
     */
    private static void testEmptyText() {
        String text = "";
        int result = TextUtils.countDistinctWords(text);

        assertEquals(0, result, "Leerer Text");
    }

    /**
     * Testet einen Text, der verschiedene Sonderzeichen enthält.
     * Es soll geprüft werden, ob removeNonLetters korrekt arbeitet
     * und nur Buchstaben + Leerzeichen übrig bleiben.
     */
    private static void testMixedCharacters() {
        String text = "Hey!!! Wie?? läuft's   so--da??";
        int result = TextUtils.countDistinctWords(text);

        assertEquals(4, result, "Gemischte Zeichen und mehrere Leerstellen");
    }
}
