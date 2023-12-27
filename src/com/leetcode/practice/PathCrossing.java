package com.leetcode.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PathCrossing {
    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }

    private static boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x =0;
        int y = 0;
        visited.add(x+" # "+y);
        for(int i=0;i<path.length();i++){
            char c = path.charAt(i);
            switch (c){
                case 'N': y++;
                    break;
                case 'S': y--;
                    break;
                case 'E': x++;
                    break;
                case 'W': x--;
            }
            String str = x+" # "+y;
            if(visited.contains(str)) return true;
            else visited.add(str);
        }
        return false;
    }
}
