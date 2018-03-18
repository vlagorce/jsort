package com.sort;

/**
 * Worst-case performance	     O(n^{2})
 * Best-case performance         O(n)
 * Average performance	         O(n^{2})
 * Worst-case space complexity	 O(1) auxiliary
 */
public class BubbleSort implements Sort {


    @Override
    public int[] sort(int[] ints) {

        boolean permutation;
        do {
            permutation = false;
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] > ints[i + 1]) {
                    int temp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = temp;
                    permutation = true;
                }

            }
        } while (permutation);
        return ints;
    }
}
