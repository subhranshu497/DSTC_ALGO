package com.algo.substring;

public class RabinKarpSubstringFinderRunner {
    public static void main(String[] args) {
        RabinKarpSubstringMatcher rks = new RabinKarpSubstringMatcher();
        System.out.println(rks.stringMatcher("abdebcabc","abc"));
    }
}
