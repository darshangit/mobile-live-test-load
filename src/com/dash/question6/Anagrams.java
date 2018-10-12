package com.dash.question6;

import java.util.function.Function;
import java.util.function.Predicate;

public class Anagrams {

    public static void main(String[] args) {

        System.out.println(isAnagram("Tom Marvolo Riddle" , "I am not Lord Voldemort"));
        System.out.println(isAnagram("Tom Marvolo Riddle" , "I am Lord Voldemort"));
        System.out.println(isAnagram(null , null));
        System.out.println(isAnagram("Tom Marvolo Riddle()" , "I am Lord Voldemort"));
    }

    static boolean isAnagram(String firstSentence, String secondSentence){
        String regexRemoveSpaces = "\\s";

        Predicate<String> isvalidString =  sentence -> sentence != null && !sentence.isEmpty()
                && sentence.replaceAll(regexRemoveSpaces,"").chars().allMatch(Character::isLetter); // only normal strings will be matched

        if(isvalidString.test(firstSentence) && isvalidString.test(secondSentence)){

            return firstWord.apply(firstSentence.replaceAll(regexRemoveSpaces,""))
                    .equals(secondWord.apply(secondSentence.replaceAll(regexRemoveSpaces,"")));
        }
        return false;
    }

    static final int[] randomNumbers = {
            1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10
    };

    // Mapping the words to random number and taking the sum out.
    // Works very well on even on large data sets
    static Function<String, Integer> firstWord = word -> word.toLowerCase().chars().map(letter -> randomNumbers[letter - 'a']).sum();
    static Function<String, Integer> secondWord = word -> word.toLowerCase().chars().map(letter -> randomNumbers[letter - 'a']).sum();
}

