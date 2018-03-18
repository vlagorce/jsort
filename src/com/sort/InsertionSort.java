package com.sort;

/**
 * Worst-case performance	    О(n2) comparisons, swaps
 * Best-case performance	    O(n) comparisons, O(1) swaps
 * Average performance	        О(n2) comparisons, swaps
 * Worst-case space complexity  О(n) total, O(1) auxiliary
 */
public class InsertionSort implements Sort {


    @Override
    public int[] sort(int[] ints) {


        for (int i = 1; i < ints.length; i++) {
            int val = ints[i];
            int j = i;
            for (; j > 0 && ints[j - 1] > val; j--) {
                ints[j] = ints[j - 1];
            }
            ints[j] = val;
        }
        return ints;
    }
}
