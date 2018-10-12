package com.dash.question4;

import java.util.function.Function;
import java.util.stream.Stream;

public class CollectionSum {

    public static void main(String[] args) {

        CollectionClass sampleObject1 = new CollectionClass("a", 1);
        CollectionClass sampleObject2 = new CollectionClass("b", 2);
        CollectionClass sampleObject3 = new CollectionClass("c", 4);

        CollectionClass[] collectionClasses = {sampleObject1,sampleObject2,sampleObject3};

        int fattenedSum = flatArray.apply(collectionClasses);

        System.out.print(fattenedSum);
    }

    static Function<CollectionClass[], Integer> flatArray = collectionClasses -> Stream.of(collectionClasses).mapToInt(CollectionClass::getVal).sum();
}
