package com.dash.question9;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        String[] arrayOfObjects = {"a","b","c"};

        System.out.println(getBinarySearchInt(arrayOfObjects,"c"));
    }

    static int getBinarySearchInt(String[] inputArray, String match){
        if(inputArray != null && inputArray.length > 0 && match != null) {
            return Arrays.binarySearch(inputArray, match);
        }
        return -1;
    }
}
