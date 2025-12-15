package dev.wpsjava.foundations.lists;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListReverserTest {

    @Test
    void reversesList_withMultipleElements() {
        // ARRANGE
        List<Integer> input = List.of(1, 2, 3, 4, 5);

        // ACT
        List<Integer> result = ListReverser.reverse(input);

        // ASSERT
        assertEquals(List.of(5, 4, 3, 2, 1), result);
    }

    @Test
    void reversesList_withOneElement() {
        // ARRANGE
        List<String> input = List.of("A");

        // ACT
        List<String> result = ListReverser.reverse(input);

        // ASSERT
        assertEquals(List.of("A"), result);
    }

    @Test
    void reversesList_emptyListReturnsEmptyList() {
        // ARRANGE
        List<String> input = List.of();

        // ACT
        List<String> result = ListReverser.reverse(input);

        // ASSERT
        assertEquals(List.of(), result);
        assertNotSame(input, result);
    }

    @Test
    void reversesList_doesNotModifyOriginalList() {
        // ARRANGE
        List<String> original = List.of("Hund", "Katze", "Maus");

        // ACT
        List<String> result = ListReverser.reverse(original);

        // ASSERT
        assertEquals(List.of("Hund", "Katze", "Maus"), original);
        assertNotSame(original, result);
    }

    @Test
    void reversesList_nullInputThrowsNullPointerException() {
        // ACT & ASSERT
        assertThrows(NullPointerException.class, () -> ListReverser.reverse(null));
    }
}
