package com.dash.question2;

import java.util.function.Predicate;

public class EvenOdd {

    public static void main(String[] args) {
        System.out.println("Even : " + evenPredicate.test(1));
        System.out.println("Even : " + evenPredicate.test(2));

        System.out.println("Odd : " + oddPredicate.test(2));
        System.out.println("Odd : " + oddPredicate.test(1));

        System.out.println("What about zero : Is it Even ?  " + evenPredicate.test(0));

    }
    static Predicate<Integer> evenPredicate = even -> {
        if(even != null) {
            return even % 2 == 0;
        }
        return false;
    };

    static Predicate<Integer> oddPredicate = odd -> {
        if(odd != null) {
            return  odd % 2 != 0;
        }
        return false;
    };
}

