package com.algo.treengraph;

import java.util.Iterator;
import java.util.LinkedList;

public class RootBetweenNodes {
    public static void main(String[] args) {
        Graph g = new Graph();
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        Node<Integer> node3 = new Node<Integer>(3);
        Node<Integer> node4 = new Node<Integer>(4);
        Node<Integer> node5 = new Node<Integer>(5);

    node1.addAdjacent(node2);
    node1.addAdjacent(node3);
    node1.addAdjacent(node4);
    node3.addAdjacent(node5);
    boolean flag = search(g, node1, node5);
    if(flag)
        System.out.println("Root exists between "+node1.data+ " and "+node5.data);
    else
        System.out.println("No root exists");
    }
    public static boolean search(Graph g, Node start, Node end){
        if(start == end) return true;
        LinkedList<Node> queue = new LinkedList<>();
        start.visit();
        queue.add(start);
        while(!queue.isEmpty()){
            Node current = queue.remove();
            System.out.println("Current Node is "+current.data);
            if(current.getAdjacent() !=null){
                Iterator<Node> nodeIter = current.getAdjacent().iterator();
                while(nodeIter.hasNext()){
                    Node neighbour = nodeIter.next();
                    if(!neighbour.visited){
                        if(neighbour ==end){
                            return true;
                        }
                        else {
                            neighbour.visit();
                            queue.add(neighbour);
                        }
                    }
                }
            }
            current.visit();
        }
        return false;
    }

}
