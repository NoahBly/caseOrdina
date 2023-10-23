package org.example;


import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        WordFrequencyclass test = new WordFrequencyclass();
        test.calculateHighestFrequency("I would like to walk walk walk in the park park");
        test.calculateHighestFrequency("I would like to eat pizza and pizza and pizza and pizza in the cinema");
        test.calculateFrequencyForWord("That is very nice nice nice in paris oui","oui");
        test.calculateFrequencyForWord("That is nice very nice nice in paris oui","nice");
        Map<String,Integer> Test = test.calculateMostFrequentNWords("ja ik zie het en ja veel zon en regen en zon",7);
        Map<String,Integer> Test2 = test.calculateMostFrequentNWords("ja ja zon regen",4);

        System.out.println(Test.toString());
        System.out.println(Test2.toString());
    }


}