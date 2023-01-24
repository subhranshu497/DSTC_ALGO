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
        //String str1 = "Java;Dotnet;Phthon;AWS;Azure;GCP";
        String str1 = "In; the United States\non December 22, 2017.Itentered, and; spreaded";
        System.out.println(str1);
        parseListOfString(str1);
    }
    public static void parseListOfString(String str){
        String[] strArr = str.split("; |, |\\R| ");
        int arrLen = strArr.length;
        int batchSize = 3;
        int batchSize_new = 0;
        System.out.println("Array length is "+arrLen);
        System.out.println("================================================================================================");
        System.out.println(Arrays.toString(strArr));
        int batchNo =0;
        int count = 0;

        while(arrLen/batchSize !=0){
            //System.out.println("Array length "+arrLen+" count "+count+" batchno "+batchNo);
            for(int i = count; i<batchSize+count;i++){
                System.out.println(strArr[i]);
            }
            //System.out.println("Count is "+count);
            batchNo++;
            count += batchSize;
            batchSize_new = batchSize_new+batchSize;
            arrLen = arrLen - batchSize;
            //System.out.println("Total No of batches are "+batchNo);
        }
        //int arrLen_new = arrLen % batchSize;
        int itemLeft = arrLen;
        //System.out.println("Total number of item left are "+itemLeft+" and Array length is "+strArr.length);
        int index = strArr.length / batchSize;
        index = index * batchSize;
        //System.out.println("Index is "+index);
        if(itemLeft != 0){
            batchNo++;
            for(int i = index; i<strArr.length;i++){
                System.out.println(strArr[i]);
            }
            System.out.println("Total No of batches are "+batchNo);
        }
    }
}
