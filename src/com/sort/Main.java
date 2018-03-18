package com.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Integer[] sortedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        List<Integer> integers = Arrays.asList(sortedArray.clone());
        Collections.shuffle(integers);
        int[] shuffleArray = integers.stream().mapToInt(i -> i).toArray();


        System.out.println(Arrays.toString(shuffleArray));
        System.out.println(Arrays.toString(useBubbleSort(shuffleArray.clone())));
        System.out.println(Arrays.toString(useInsertionSort(shuffleArray.clone())));
        System.out.println(Arrays.toString(useSelectionSort(shuffleArray.clone())));
        System.out.println(Arrays.toString(useCocktailShakerSort(shuffleArray.clone())));
    }

    private static int[] useBubbleSort(int[] ints) {
        return new BubbleSort().sort(ints);
    }

    private static int[] useInsertionSort(int[] ints) {
        return new InsertionSort().sort(ints);
    }

    private static int[] useSelectionSort(int[] ints) {
        return new SelectionSort().sort(ints);
    }

    private static int[] useCocktailShakerSort(int[] ints) {
        return new CocktailShakerSort().sort(ints);
    }

}
