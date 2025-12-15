package dev.wpsjava.foundations.text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TextUtilsTest {

    @Test
    void countsDistinctWords_ignoresCaseAndPunctuation() {
        // ARRANGE
        String text = "Hallo hallo, du hallo.";

        // ACT
        int result = TextUtils.countDistinctWords(text);

        // ASSERT
        assertEquals(2, result);
    }

    @Test
    void countsDistinctWords_emptyStringIsZero() {
        // ARRANGE
        String text = "";

        // ACT
        int result = TextUtils.countDistinctWords(text);

        // ASSERT
        assertEquals(0, result);
    }

    @Test
    void countsDistinctWords_handlesMultipleSpacesAndSymbols() {
        // ARRANGE
        String text = "Hey!!! Wie?? läuft's   so--da??";

        // ACT
        int result = TextUtils.countDistinctWords(text);

        // ASSERT
        assertEquals(4, result);
    }

    @Test
    void countDistinctWords_nullInputThrowsNullPointerException() {
        // ACT & ASSERT
        assertThrows(NullPointerException.class, () -> TextUtils.countDistinctWords(null));
    }
}
