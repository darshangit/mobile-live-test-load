package com.dash.question7;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ArrayIntersection {

    public static void main(String[] args) {
        String[] firstArray = {"f", "a" , "b" , "c", null, "l" , "k", "a", "r", "k"};
        String[] secondArray = {"b" , "c" , "d", null, "r", "c", "f", "f" ,"q"};

        String[] intersectedArray = getIntersection(firstArray,secondArray);

        if(intersectedArray != null && intersectedArray.length > 0)
            Arrays.stream(intersectedArray).forEach(commonElement -> System.out.print(commonElement + " "));
    }

    static String[] getIntersection(String[] firstArray, String[] secondArray){

        Predicate<String[]> isValidArray = array -> array != null && array.length > 0;

        if(isValidArray.test(firstArray) && isValidArray.test(secondArray)){


            //duplicates are are also shown - we just need to add distinct if no duplicates to be shown
            Stream<Stream<String>> streamOfStreams = Stream.of(Stream.of(firstArray), Stream.of(secondArray));
            return streamOfStreams.flatMap(Function.identity()).filter(Objects::nonNull).filter(stringStream ->
                    Stream.of(firstArray).anyMatch(firstArrayElement -> firstArrayElement != null && firstArrayElement.equals(stringStream)) &&
                            Stream.of(secondArray).anyMatch(secondArrayElement -> secondArrayElement != null && secondArrayElement.equals(stringStream)))
                    .toArray(String[]::new);

        }

        return null;
    }
}
