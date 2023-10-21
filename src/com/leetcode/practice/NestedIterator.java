package com.leetcode.practice;

import com.leetcode.practice.NestedInteger;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


public class NestedIterator implements Iterator<Integer> {

    private Iterator<Integer> iter;

    //initialize the nested list received as input
    public NestedIterator(List<NestedInteger> nestedList){
        this.iter = nestedList.stream().flatMap(NestedIterator::flatten).iterator();
    }

    private static Stream<Integer> flatten(NestedInteger nestedInteger) {
        if(nestedInteger.isInteger()) return Stream.of(nestedInteger.getInteger());
        //do recursion
        else{
            return nestedInteger.getList().stream().flatMap(NestedIterator::flatten);
        }
    }

    @Override
    public Integer next() {
        return iter.next();
    }

    @Override
    public boolean hasNext() {
        return iter.hasNext();
    }



}