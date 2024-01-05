package com.leetcode.practice.goldmanSach;

import java.util.LinkedList;

public class DesignHashmap {
    LinkedList<Entry>[] map;
    public static int size = 769;
    public DesignHashmap(){
        map = new LinkedList[size];
    }
    //value would be non-negative
    public void put(int key, int value){
        int bucket = value % size;
        if(map[bucket]==null){
            map[bucket] = new LinkedList<Entry>();
            map[bucket].add(new Entry(key, value));
        }
        else{
            for(Entry e:map[bucket]){
                if(e.key == key){
                    e.val = value;
                    return;
                }
            }
            map[bucket].add(new Entry(key, value));
        }
    }
    public int get(int key){
        int bucket = key % size;
        LinkedList<Entry> entries = map[bucket];
        if(entries == null) return -1;
        for(Entry e:entries){
            if(e.key == key) return e.val;
        }
        return -1;
    }
    public void remove(int key){
        int bucket = key % size;
        Entry toRemove = null;
        if(map[bucket]== null) return;
        else{
            for(Entry e:map[bucket]){
                if(e.key==key) toRemove = e;
            }
            if(toRemove == null) return;
            map[bucket].remove(toRemove);
        }
    }
}

class Entry{
    public int key;
    public int val;

    public Entry(int key, int val){
        this.key = key;
        this.val = val;
    }
}
