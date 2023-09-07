package com.java_codes.ordination;

public class BubbleSort {
    public int[] execute(int[] numbers) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 0; index < numbers.length - 1; index++) {
                if (numbers[index] >= numbers[index + 1]) {
                    int swapping = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = swapping;
                    swapped = true;
                }
            }
        }
        return numbers;
    }
}
