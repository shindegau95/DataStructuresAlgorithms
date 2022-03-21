package com.gogo.problems.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraySort {

    public static void main(String[] args) {
        // sorts in descending order
        List<Integer> numbers = new ArrayList<>();
        numbers = IntStream.range(0, 5).boxed().sorted().collect(Collectors.toList());
        System.out.println(numbers);
        sort(numbers);
        System.out.println(numbers);
    }

    private static void sort(List<Integer> numbers) {
        if(numbers.size() == 0){
            return;
        }
        Integer popped = numbers.remove(numbers.size()-1);
        sort(numbers);
        insert(numbers, popped);
    }

    private static void insert(List<Integer> numbers, Integer popped) {
        if(numbers.size() == 0 || numbers.get(0) <= popped){
            numbers.add(0,popped );
            return;
        }
        Integer value = numbers.remove(numbers.size() - 1);
        insert(numbers, value);
    }
}
