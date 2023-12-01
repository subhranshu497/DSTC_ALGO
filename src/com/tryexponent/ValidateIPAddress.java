package com.tryexponent;

import java.util.ArrayList;
import java.util.List;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String str = "192.168.0.1";
        System.out.println(validateIP(str));
    }

    private static boolean validateIP(String str) {
            String[] s = str.split("\\.", -1);
            if(s.length != 4) return false;
            else{
                for(String sItem: s){
                    int value = Integer.parseInt(sItem);
                    if(!(value>=0 && value <=255)) {
                        return false;
                    }
                    else return true;
                }
            }
            return false;
    }
}
