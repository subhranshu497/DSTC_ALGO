package com.algo.treengraph;

import java.util.HashSet;
import java.util.Set;

public class Node<I extends Number> {
    public Integer data;
    public boolean visited;
    private Set<Node<Integer>> adjacent = new HashSet<>();

    public Node(Integer data){
        this.data = data;
    }

    public Set<Node<Integer>> getAdjacent(){
        return adjacent;
    }
    public  Integer getData(){
        return data;
    }
    public void visit(){
        visited = true;
    }
    public void addAdjacent(Node<Integer> node){
         adjacent.add(node);
    }
    public void addAdjacents(Set<Node<Integer>> nodes){
         adjacent.addAll(nodes);
    }

}
