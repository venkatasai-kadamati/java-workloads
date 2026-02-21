package com.vsai.topics.graphs.representation;

import java.util.ArrayList;
import java.util.List;

public class UsingList {
    public static void main(String[] args) {
        // inputs -> n (no of vertex), m (no of edges)
        int n = 3;
        int m = 3;

        // inputs -> line wise edge b/w vertexes
        // edge 1 -> 2
        // edge 2 -> 3
        // edge 3 -> 1

        // nested list of size n+1.
        List<List<Integer>> adj = new ArrayList<>();

        // visually
        // list | 1 2 3 |
        //        2 1 1
        //        3 3 2

        // step1: create a list with n+1 empty lists
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }
        // gives us | [] | [] | [] | [] | => each index represent vertex and in each one we will populate its neighbouring vertexes.

        // step2: populate neighbouring vertexes.
        // since undirected, we set for 1 -> 2 & 2 -> 1 also
        adj.get(1).add(2);
        adj.get(1).add(3);

        adj.get(2).add(1);
        adj.get(2).add(3);

        adj.get(3).add(1);
        adj.get(3).add(2);

        System.out.println(adj);
        // printing matrix
        // Traversal.printMatrix(adj);
    }
}
