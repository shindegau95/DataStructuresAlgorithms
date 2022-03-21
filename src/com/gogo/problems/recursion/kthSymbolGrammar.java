package com.gogo.problems.recursion;

public class kthSymbolGrammar {
    /**
     * input - (n,k), where n is row and k is column
     * output - grammar
     * base condition (given) -
     * if(n==1 && k == 1)
     * return 0;
     * <p>
     * grammar (given)
     * for grammar(n) ->  convert(grammar(n-1))
     * where convert(0) -> 01
     * and convert(1) -> 10
     * <p>
     * Thus,
     * n\k     1   2   3   4
     * 1       0
     * 2       0   1
     * 3       0   1   1   0
     */

    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        int symbol = grammar(n, k);
        System.out.println("symbol = " + symbol);
    }

    private static int grammar(int n, int k) {
        if (n == 1 && k == 1) {
            return 0;
        } else {
            int length = (int) Math.pow(2, n - 1);
            if (k <= length / 2) {
                return grammar(n - 1, k);
            } else {
                return compliment(grammar(n - 1, k - (length / 2)));
            }
        }
    }

    private static int compliment(int sym) {
        return sym == 0 ? 1 : 0;
    }


}
