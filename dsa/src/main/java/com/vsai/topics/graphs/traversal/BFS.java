package com.vsai.topics.graphs.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
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
        insertNeighbours(adj, 1, new int[]{2, 6});
        insertNeighbours(adj, 2, new int[]{3, 4, 1});
        insertNeighbours(adj, 3, new int[]{2});
        insertNeighbours(adj, 4, new int[]{2, 5});
        insertNeighbours(adj, 5, new int[]{4, 7});
        insertNeighbours(adj, 6, new int[]{7, 8, 1});
        insertNeighbours(adj, 7, new int[]{6, 5});
        insertNeighbours(adj, 8, new int[]{6});

        System.out.println(adj);

        // perform bfs traversal
        bfsTraversal(adj);

        // perform dfs traversal
        dfsTraversal(adj);
    }

    // func: insert neighbouring vertexes
    public static void insertNeighbours(List<List<Integer>> adj, int u, int[] vList) {
        for (int j : vList) {
            adj.get(u).add(j);
        }
    }

    // func: depth first search (dfs)
    // func: breath first search (bfs)
    public static void bfsTraversal(List<List<Integer>> adj) {
        // intial setup - queue & visited array
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[adj.size() + 1];

        // list to hold final output
        ArrayList<Integer> bfsOutput = new ArrayList<>();

        // step-1: add starting node (1-based) into queue and update visited as true
        q.add(1);
        vis[1] = true;

        // step-2: keep removing elements from queue until empty.
        // for each removed node, add it into bfsOutput
        while (!q.isEmpty()) {
            int currentNode = q.poll();
            bfsOutput.add(currentNode);

            // step-3: add neighbours onl
            // y if not visited
            for (int elem : adj.get(currentNode)) {
                if (!vis[elem]) {
                    // add into queue
                    q.add(elem);
                }
                vis[elem] = true;
            }
        }

        System.out.println(bfsOutput);
    }

    public static void dfsTraversal(List<List<Integer>> adj) {

    }
}
