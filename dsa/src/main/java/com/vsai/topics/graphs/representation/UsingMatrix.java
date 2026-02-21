package com.vsai.topics.graphs.representation;

import com.vsai.utils.Traversal;

public class UsingMatrix {
    public static void main(String[] args) {
        // inputs -> n (no of vertex), m (no of edges)
        int n = 3;
        int m = 3;

        // inputs -> line wise edge b/w vertexes
        // edge 1 -> 2
        // edge 2 -> 3
        // edge 3 -> 1

        // matrix (2d array) of size n+1.
        int[][] adj = new int[n + 1][n + 1];

        // set matrix indexes for each edge found
        // since undirected, we set for 1 -> 2 & 2 -> 1 also
        adj[1][2] = 1;
        adj[2][1] = 1;

        adj[2][3] = 1;
        adj[3][2] = 1;

        adj[1][3] = 1;
        adj[3][1] = 1;

        // printing matrix
        Traversal.printMatrix(adj);
    }
}
