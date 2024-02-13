package com.java_codes.ordination;

import java.util.Arrays;

public class Ordination {

    public static void main(String[] args) {
        int[] aleatoryNumbers = { 5, 18, 10, 49, 16, 49, 10, 82, 43, 12 };

        SelectionSort selectionSort = new SelectionSort();
        int[] orderedNumbersSelection = selectionSort.execute(aleatoryNumbers);
        System.out.println(Arrays.toString(orderedNumbersSelection));

        BubbleSort bubbleSort = new BubbleSort();
        int[] orderedNumbersBubble = bubbleSort.execute(aleatoryNumbers);
        System.out.println(Arrays.toString(orderedNumbersBubble));
    }
}
