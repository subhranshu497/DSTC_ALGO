package com.algo.bitManipulation;

public class ArithmaticNLogicalRightShift {
    public int arithmaticRightShift(int num, int count){
        for(int i =0; i< count; i++){
            num >>=1;
        }
        return num;
    }

    public int logicalRightShift(int num, int count){
//        for(int i=0; i<count; i++){
//            num >>>=1;
//        }
        return num>>>=1;
    }
}
