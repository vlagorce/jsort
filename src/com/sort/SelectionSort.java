package com.sort;


import java.util.Arrays;

/**
 * Worst-case performance	    О(n2) comparisons, О(n) swaps
 * Best-case performance	    О(n2) comparisons, О(n) swaps
 * Average performance	        О(n2) comparisons, О(n) swaps
 * Worst-case space complexity	O(1) auxiliary
 */
public class SelectionSort implements Sort {


    @Override
    public int[] sort(int[] ints) {


        for (int i = 0; i < ints.length; i++) {
            int smallest = i;
            for (int j = i; j < ints.length; j++) {
                if (ints[j] < ints[smallest]) {
                    smallest = j;
                }
            }
            int tmp = ints[i];
            ints[i] = ints[smallest];
            ints[smallest] = tmp;
        }
        return ints;
    }
}
