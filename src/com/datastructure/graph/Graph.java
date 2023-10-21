package com.datastructure.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    /**
     * graph can be represented using 2d arrays and hashmap
     * here we are using hashmap due to its better O(n)
     */
    HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    //to get the list
    public HashMap<String, ArrayList<String>> getList(){
        return adjList;
    }
    //to display the list
    public void displayList(){
        System.out.println(adjList);
    }
    /**
     * utility method to add the vertex
     */
    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }
    /**
     * utility method to add edges
     * note - edge always connects two vertices
     * so this method should accept two parameters
     * A, [B]
     * B, [A]
     */
    public boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) !=null && adjList.get(vertex2) !=null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
    /**
     * Utility method to remove edge
     * A, [B,C]
     * B, [A,C]
     * C, [A,B]
     * if removing the edge between A,C, then op would be
     * A, [B]
     * B, [A,C]
     * C, [B]
     */
    public boolean removeEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) !=null && adjList.get(vertex2) != null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }
    /**
     * utility method to remove vertex
     * A, [B,C]
     * B, [A,C]
     * C, [A,B]
     * remove B
     * A, [C]
     * C, [A]
     */
    public boolean removeVertex(String vertex){
        if(adjList.get(vertex) !=null){
            for(String otherVertex:adjList.get(vertex)){
                adjList.get(otherVertex).remove(vertex);
            }
            adjList.remove(vertex);
            return true;
        }
        return false;
    }
}
