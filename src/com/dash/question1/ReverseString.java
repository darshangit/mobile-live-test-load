package com.dash.question1;

import java.util.function.Function;

public class ReverseString {

    public static void main(String[] args) {
          System.out.println("Reversed String : " + reverse.apply("Computers are fun."));
    }

    static Function<String, String> reverse = incomingString -> {
        if ( incomingString != null && !incomingString.isEmpty()) {
            return new StringBuilder(incomingString).reverse().toString();
        }
        return null;
    };
}



