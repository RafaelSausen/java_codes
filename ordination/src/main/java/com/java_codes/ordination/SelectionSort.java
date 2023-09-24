package com.java_codes.ordination;

public class SelectionSort {
    public int[] execute(int[] numbers) {
        for (int firstIndex = 0; firstIndex < numbers.length; firstIndex++) {
            int minimum = firstIndex;
            for (int secondIndex = firstIndex + 1; secondIndex < numbers.length; secondIndex++) {
                if (numbers[minimum] > numbers[secondIndex])
                    minimum = secondIndex;
            }
            if (minimum != firstIndex) {
                int swapping = numbers[firstIndex];
                numbers[firstIndex] = numbers[minimum];
                numbers[minimum] = swapping;
            }
        }
        return numbers;
    }
}
