package com.java_codes.ordination;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {
    static SelectionSort selectionSort;

    @BeforeAll
    static void setUp() {
        selectionSort = new SelectionSort();
    }

    @Test
    void testExecute() {
        int[] aleatoryNumbers = { 5, 18, 10, 16, 49, 82, 43, 12 };
        int[] orderedNumbers = { 5, 10, 12, 16, 18, 43, 49, 82 };
        int[] resultArray = selectionSort.execute(aleatoryNumbers);
        assertArrayEquals(orderedNumbers, resultArray, "Should return the ordered numbers");
    }

    @Test
    void testExecuteWithRepeatedElements() {
        int[] aleatoryNumbers = { 5, 18, 10, 49, 16, 49, 10, 82, 43, 12 };
        int[] orderedNumbers = { 5, 10, 10, 12, 16, 18, 43, 49, 49, 82 };
        int[] resultArray = selectionSort.execute(aleatoryNumbers);
        assertArrayEquals(orderedNumbers, resultArray, "Should return the ordered numbers");
    }
}
