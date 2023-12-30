package com.leetcode.practice;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int rowNum = 4;
        System.out.println(convert(s,rowNum));
    }

    private static String convert(String s, int rowNum) {
        int charInSection = 2*(rowNum-1); //2(4-1)=6
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for(int currRow =0;currRow<rowNum;currRow++){
            int index = currRow;
            while(index <length){
                sb.append(s.charAt(index));
                if(currRow !=0 && currRow !=(rowNum-1)){
                    int charInBetween = charInSection- (2*currRow);
                    int secondIndex = index+charInBetween;
                    if(secondIndex<length) sb.append(s.charAt(secondIndex));
                }
                index += charInSection;
            }
        }
        return sb.toString();
    }


}
