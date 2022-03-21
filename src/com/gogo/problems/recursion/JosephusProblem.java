package com.gogo.problems.recursion;

import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
    /*
     * Fight between Jews and romans
     * Jews decided to kill themselves instead of being killed by the Romans
     * Every person will kill other, at the end only one person will be left
     * However, that person has to commit suicide
     * Note - Josephus was the one who was left at the end, and he did not kill himself!
     * input
     * n is the number of people
     * k is the position to be killed by 1
     * */

    public static void main(String[] args) {
        int n = 40;
        int k = 7;
        int start = 1;
        List<Integer> soldiers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            soldiers.add(i+1);
        }
        int saved = solve(n, k-1, start - 1, soldiers);
        System.out.println("saved = " + saved);
    }

    private static int solve(int n, int k, int start, List<Integer> soldiers) {
        if(soldiers.size() == 1){
            return soldiers.get(0);
        }
        int killed = (start + k) % soldiers.size();
        System.out.println(soldiers.get(killed) + " killed");
        soldiers.remove(killed);
        return solve(n, k, killed, soldiers);
    }
}
