package com.dash.question5;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindrome.test("Name not an one man"));
        System.out.println(palindrome.test("Name not one man"));
        System.out.println(palindrome.test("Name no one man"));

        System.out.println(palindrome.test(null));
    }

    static Predicate<String> palindrome = incomingString ->

    {
        if(incomingString != null && !incomingString.isEmpty()) {

            final String incomingStringWithoutSpaces = incomingString.replaceAll("\\s+", "").toLowerCase();

            // just traverse half the string and compare from the 2 ends.
            return IntStream.range(0, incomingString.length() / 2)
                    .noneMatch(value -> incomingStringWithoutSpaces.charAt(value) !=
                            incomingStringWithoutSpaces.charAt(incomingStringWithoutSpaces.length() - 1 - value));
        }
        return false;
    };
}

