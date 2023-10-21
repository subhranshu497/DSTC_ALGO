package com.leetcode.practice;

import java.util.List;

public interface NestedInteger {
    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();
    public Integer getInteger();
    public List<NestedInteger> getList();
}
