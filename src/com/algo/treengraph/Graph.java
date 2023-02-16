package com.algo.treengraph;

import java.util.HashSet;
import java.util.Set;

public class Graph {
    private final Set<Node<Number>> nodes = new HashSet<>();

    public Set<Node<Number>> getNodes(){
        return nodes;
    }
    public void addNodes(Node<Number> node){
        nodes.add(node);
    }
    public boolean removeNode(Node<Number> node){
        return nodes.remove(node);
    }

}
