package com.algo.bitManipulation;

public class ShiftDriver {

    public static void main(String[] args) {
        ArithmaticNLogicalRightShift rlrs = new ArithmaticNLogicalRightShift();
        int arithmaticShiftResult = rlrs.arithmaticRightShift(-75,1);
        System.out.println(arithmaticShiftResult);
        ArithmaticNLogicalRightShift rlrs1 = new ArithmaticNLogicalRightShift();
        int logicalShiftResult = rlrs1.logicalRightShift(-75,1);
        System.out.println(logicalShiftResult);
    }
}
