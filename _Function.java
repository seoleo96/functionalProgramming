package com.functionalProgramming;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int stop = 2;
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);

        System.out.println(Arrays.toString(arraysGreatThan2.apply(arr, stop)));
        System.out.println(sumArraysGreatThan2.apply(arr,stop));
        System.out.println(sumArraysGreatThanTwoMethod(arr,stop));

        int sum = 0;
        for (int temp : arr) {
            sum += temp;
        }
        System.out.println("sum of array - " + sum);
        System.out.println("--------------");
        System.out.println(sumOfarray.apply(arr));

        System.out.println(sumStream.apply(arr));


    }


    static Function<int[], Integer> sumOfarray = a -> Arrays.stream(a).sum();


    static Function<int[], Integer> sumStream =
            a -> Arrays.stream(a).min().getAsInt();

    static BiFunction<int[], Integer, int[]> arraysGreatThan2 =
            (a, b) -> Arrays.stream(a).filter(temp -> temp > b).toArray();
    static BiFunction<int[], Integer, Integer> sumArraysGreatThan2 =
            (a, b) -> Arrays.stream(a).filter(temp -> temp > b).sum();

    static int sumArraysGreatThanTwoMethod(int[] a, int stop){
        int sum = 0;
        for (int value : a) {
            if (value > stop) {
                sum+=value;
            }
        }
        return sum;
    }

}



