package io.mgueye.topics.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
  private int V;

  private LinkedList[] adj;
  private ArrayList<ArrayList<Integer>> components;

  Graph(int v) {
    V = v;
    adj = new LinkedList[V];
    for (int i = 0; i < V; i++)
      adj[i] = new LinkedList<>();
  }

  void addEdge(int src, int dst, boolean isUndirected) {
    adj[src].add(dst);
    if (isUndirected)
      adj[dst].add(src);
  }

  // TODO: Method to count and store components in a graph.

  // TODO: Method to classify edges of graph.

  // TODO: Method to count reachable cells.
}
