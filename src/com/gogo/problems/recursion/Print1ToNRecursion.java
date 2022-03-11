package com.gogo.problems.recursion;

public class Print1ToNRecursion {
    public static void main(String[] args) {
        int n = 7;
        print(n);
    }

    private static void print(int n) {
        if(n == 1){
            System.out.println(n);
        }else{
            print(n-1);
            System.out.println(n);
        }
    }
}
