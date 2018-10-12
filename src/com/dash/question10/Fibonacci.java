package com.dash.question10;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {

        int[] fibArray = fibonacci.apply(9);

        if(fibArray != null && fibArray.length > 0)
            Arrays.stream(fibArray).forEach(value -> System.out.print(value + " "));
    }

    static Function<Integer, int[]> fibonacci = limitNumber -> {

        if(limitNumber != null) {
            // This is called as co recursion. Decent performance
            return Stream.iterate(new int[]{0, 1}, streamTuple -> new int[]{streamTuple[1], streamTuple[0] + streamTuple[1]})
                    .limit(limitNumber)
                    .mapToInt(value -> value[0])
                    .toArray();
        }
        return null;
    };
}
