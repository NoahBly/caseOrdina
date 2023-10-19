package org.example;


import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        WordFrequencyclass test = new WordFrequencyclass();
        test.calculateHighestFrequency("walk walk walk in the park park");
        test.calculateFrequencyForWord("nice nice nice in paris oui","oui");
        Map<String,Integer> Test = test.calculateMostFrequentNWords("ja ja zon regen regen",4);
        System.out.println(Test.toString());
    }


}