package dev.wpsjava.foundations.lists;

import java.util.List;

public class ListReverserTest {

    public static void main(String[] args) {
        testReverseNormal();
        testReverseEmpty();
        testReverseSingleElement();
    }

    /**
     * Einfache Vergleichsmethode, um erwartete und tatsächliche Ergebnisse
     * gegenüberzustellen. So lässt sich schnell prüfen, ob die Methode korrekt arbeitet.
     */
    private static void assertEquals(List<?> expected, List<?> actual, String testName) {
        if (!expected.equals(actual)) {
            System.out.println("Fehler in " + testName +
                    ": erwartet " + expected + ", aber war " + actual);
        } else {
            System.out.println("OK    " + testName);
        }
    }

    /**
     * Testet das Umdrehen einer normalen Liste mit mehreren Elementen.
     * Erwartung: Die Reihenfolge wird vollständig umgekehrt.
     */
    private static void testReverseNormal() {
        List<Integer> input = List.of(1, 2, 3);
        List<Integer> expected = List.of(3, 2, 1);

        List<Integer> result = ListReverser.reverse(input);
        assertEquals(expected, result, "Normale Liste umdrehen");
    }

    /**
     * Testet das Verhalten bei einer leeren Liste.
     * Erwartung: Die Methode gibt ebenfalls eine leere Liste zurück.
     */
    private static void testReverseEmpty() {
        List<Integer> input = List.of();
        List<Integer> expected = List.of();

        List<Integer> result = ListReverser.reverse(input);
        assertEquals(expected, result, "Leere Liste");
    }

    /**
     * Testet das Verhalten, wenn nur ein einziges Element enthalten ist.
     * Erwartung: Die Liste bleibt unverändert.
     *
     * Hier verwende ich Strings, um zu zeigen, dass die Methode unabhängig vom Datentyp funktioniert.
     */
    private static void testReverseSingleElement() {
        List<String> input = List.of("A");
        List<String> expected = List.of("A");

        List<String> result = ListReverser.reverse(input);
        assertEquals(expected, result, "Einzelnes Element");
    }
}
