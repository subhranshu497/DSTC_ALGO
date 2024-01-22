package com.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LastRecentlyUsedCache {
    private int capacity;
    private Map<Integer, ListNode> addressStore;
    ListNode head;
    ListNode tail;
    public LastRecentlyUsedCache(int capacity){
        this.capacity = capacity;
        addressStore = new HashMap<>();
        head = new ListNode(-1,-1);
        tail = new ListNode(-1,-1);
        head.next = tail;
        tail.prev = head;
    }
    public void add(ListNode node){
        ListNode prevEnd = tail.prev;
        prevEnd.next = node;
        node.prev = prevEnd;
        tail.prev = node;
    }
    public void remove(ListNode node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public int get(int key){
        if(!addressStore.containsKey(key)) return -1;
        ListNode node = addressStore.get(key);
        remove(node);
        add(node);
        return node.val;
    }
    public void put(int key, int val){
        if(addressStore.containsKey(key)){
            ListNode oldNode = addressStore.get(key);
            remove(oldNode);
        }
        ListNode node = new ListNode(key, val);
        addressStore.put(key, node);
        add(node);
        if(addressStore.size() > capacity){
            ListNode nodeToDelete = head.next;
            remove(nodeToDelete);
            addressStore.remove(nodeToDelete.key);
        }
    }
}

class ListNode{
    int key;
    int val;
    ListNode next;
    ListNode prev;
    public ListNode(int key, int val){
        this.key = key;
        this.val = val;
    }

}
