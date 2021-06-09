package com.gogo.problems.dynamicProgramming;

public class SticklerThief {

    /*
     * There are n houses build in a line, each of which contains some value in it.
     * A thief is going to steal the maximal value of these houses, but he can’t steal
     * in two adjacent houses because the owner of the stolen houses will tell his two neighbors left and right side.
     * What is the maximum stolen value?
     *
     * Input: val[] = {6, 7, 1, 3, 8, 2, 4}
     * Output: 19
     *
     * Explanation: The thief will steal 6, 1, 8 and 4 from the house.
     *
     * Input: val[] = {5, 3, 4, 11, 2}
     * Output: 16
     *
     * Explanation: Thief will steal 5 and 11
     * */

    public int getMaximumStolenValue(int[] a) {
        return getMaximumStolenValue(a, a.length - 1);
    }

    public int getMaximumStolenValue(int[] a, int i) {
        if (i < 0) {
            return 0;
        } else {
            int included = a[i] + getMaximumStolenValue(a, i - 2);
            int excluded = getMaximumStolenValue(a, i - 1);
            return Math.max(included, excluded);
        }
    }
}
