package com.vsai.topics.graphs.traversal;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    public static void main(String[] args) {
        // adjacency list
        int n = 8;
        int m = 8;

        // nested list
        List<List<Integer>> adj = new ArrayList<>();

        // add edges
        // first lets put n+1 empty lists
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // adding values
        insertNeighbours(adj, 1, new int[]{2, 3});
        insertNeighbours(adj, 2, new int[]{1, 5, 6});
        insertNeighbours(adj, 3, new int[]{1, 4, 7});
        insertNeighbours(adj, 4, new int[]{3, 8});
        insertNeighbours(adj, 5, new int[]{2});
        insertNeighbours(adj, 6, new int[]{2});
        insertNeighbours(adj, 7, new int[]{3, 8});
        insertNeighbours(adj, 8, new int[]{4, 7});

        System.out.println(adj);

        // perform dfs traversal
        var output = dfsTraversal(adj);
        System.out.println(output);
    }

    // func: insert neighbouring vertexes
    public static void insertNeighbours(List<List<Integer>> adj, int u, int[] vList) {
        for (int j : vList) {
            adj.get(u).add(j);
        }
    }

    // func: depth first search (dfs)
    public static List<Integer> dfsTraversal(List<List<Integer>> adj) {
        // step-1: have n+1 sized visited array
        boolean[] vis = new boolean[adj.size() + 1];

        // mark start as visited
        int start = 1;
        vis[start] = true;

        // dfs output list
        List<Integer> dfsOutput = new ArrayList<>();

        dfs(start, adj, vis, dfsOutput);

        return dfsOutput;
    }

    public static void dfs(int node, List<List<Integer>> adj, boolean[] vis, List<Integer> dfsOutput) {
        // marking node as visited "1"
        // adding to the dfsOutput
        vis[node] = true;
        dfsOutput.add(node);

        // getting neighbour nodes
        for (int elem : adj.get(node)) {
            // if not visited
            if (!vis[elem]) {
                dfs(elem, adj, vis, dfsOutput);
            }
        }
    }
}
