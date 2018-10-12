package com.dash.question3;

import java.util.function.Function;
import java.util.stream.Stream;

public class FlatArray {

    public static void main(String[] args) {

        CollectionClass sampleObject1 = new CollectionClass("a", 1);
        CollectionClass sampleObject2 = new CollectionClass("b", 2);
        CollectionClass sampleObject3 = new CollectionClass("c", 4);

        CollectionClass[] collectionClasses = {sampleObject1,sampleObject2,sampleObject3};

        Object[] flattenedList = flatArray.apply(collectionClasses);

        if(flattenedList != null && flattenedList.length > 0)
            Stream.of(flattenedList).forEach(collectionClass -> System.out.print(collectionClass + " "));
    }

    static Function<CollectionClass[], Object[]> flatArray = collectionClasses -> Stream.of(collectionClasses).map(CollectionClass::getVal).toArray();
}
