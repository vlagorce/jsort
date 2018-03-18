package com.sort;

/**
 * Worst-case performance	    O(n^{2})
 * Best-case performance	    O(n)
 * Average performance	        O(n^{2})
 * Worst-case space complexity  O(1)
 */
public class CocktailShakerSort implements Sort {
    @Override
    public int[] sort(int[] ints) {
        boolean permutation;
        int i = 0;
        int inc = 1;
        int debut = 1, fin = ints.length - 1;
        do {
            permutation = false;
            while (((inc == 1) && (i < fin)) || ((inc == -1) && (i > debut))) {
                i += inc;
                if (ints[i] < ints[i - 1]) {
                    int temp = ints[i];
                    ints[i] = ints[i - 1];
                    ints[i - 1] = temp;
                    permutation = true;
                }
            }
            if (inc == 1) {
                fin--;
            } else {
                debut++;
            }
            inc = -inc;
        } while (permutation);
        return ints;
    }
}