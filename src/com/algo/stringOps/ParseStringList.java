package com.algo.stringOps;

import java.util.Arrays;
import java.util.List;

//input - string1, string2, string3, string4
//output - string1
// string2
//string3
//string4
public class ParseStringList {
    public static void main(String[] args) {
        List<String> strings = null;
        String str1 = "Java;Dotnet;Phthon;AWS;Azure;GCP";
        System.out.println("Input was :- "+str1);
        parseListOfString(str1);
    }
    public static void parseListOfString(String str){
        //String[] strArr = str.split("\\R" || "\\s+" ||","||";");
        String[] strArr = str.split("\\R\\s+,;");
        System.out.println(Arrays.toString(strArr));
        for(String s:strArr){
            System.out.println(s);
        }
    }
}
