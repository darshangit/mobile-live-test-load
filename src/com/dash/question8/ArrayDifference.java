package com.dash.question8;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ArrayDifference {

    public static void main(String[] args) {
        String[] firstArray = {"a" , "b" , "c", "f", "k"};
        String[] secondArray = {"b" , "c" , "d","r","s","o", null};

        String[] intersectedArray = getIntersection(firstArray,secondArray);

        if(intersectedArray != null && intersectedArray.length > 0)
            Arrays.stream(intersectedArray).forEach(commonElement -> System.out.print(commonElement + " "));
    }

    static String[] getIntersection(String[] firstArray, String[] secondArray){

        Predicate<String[]> isValidArray = array -> array != null && array.length > 0;

        // If any of the arrays is null, it means they are different
        if(isValidArray.test(firstArray) && !isValidArray.test(secondArray)){
            return firstArray;
        }

        if(isValidArray.test(secondArray) && !isValidArray.test(firstArray)){
            return secondArray;
        }
        //main logic check

        if(isValidArray.test(firstArray) && isValidArray.test(secondArray)){

            Stream<Stream<String>> streamOfStreams = Stream.of(Stream.of(firstArray), Stream.of(secondArray));

            // Make it flat and then the logic. handles for different arrays sizes
            return streamOfStreams.flatMap(Function.identity()).filter(Objects::nonNull).filter(stringStream ->
                    !Stream.of(firstArray).anyMatch(firstArrayElement -> firstArrayElement != null && firstArrayElement.equals(stringStream)) ||
                            !Stream.of(secondArray).anyMatch(secondArrayElement -> secondArrayElement != null && secondArrayElement.equals(stringStream)))
                    .toArray(String[]::new);

        }

        return null;
    }
}
