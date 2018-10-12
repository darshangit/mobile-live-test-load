package com.dash.question11;

import java.util.Arrays;

public class MoveIncreaseDecrease {

    public static void main(String[] args) {
        Integer [] array2 = {1,2,3,4,5};
        Integer [] array3 = {3,4,5,6,7};
        Integer [] array4 = {1,2,3,4,5};
        Integer [] array5 = {1,2,3,4,5};


        System.out.println(cycle(3,1,1,5,array2));
        System.out.println(cycle(7,-2,1,5,array3));
        System.out.println(cycle(3,-3,1,5,array4));
        System.out.println(cycle(3,3,1,5,array5));
    }

    static int cycle(Integer current, Integer move, int start, int end, Integer[] array){

        int currentIndex = Arrays.asList(array).indexOf(current);
        int movementOfIndex = currentIndex  + move;

        if(array != null && array.length > 0) {
            if (movementOfIndex >= array.length) {
                movementOfIndex = array.length - movementOfIndex;
            }

            if (movementOfIndex < 0) {
                movementOfIndex = Math.abs(array.length + movementOfIndex);
            }
        }

        return movementOfIndex;
    }
}
