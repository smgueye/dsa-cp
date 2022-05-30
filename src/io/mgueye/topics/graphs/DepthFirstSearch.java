package io.mgueye.topics.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class DepthFirstSearch {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;
  public ArrayList<ArrayList<Integer>> graph;

  public void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
    visited[node] = true;
    for (int i = 0; i < graph.get(node).size(); i++) {
      Integer child = graph.get(node).get(i);
      if (!visited[child])
        dfs(child, visited, graph);
    }
    writer.printf("%d, ", node);
  }

  public int countConnectedComponents(boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
    int numberConnectedComponents = 0;
    for (int i = 0; i < graph.size(); i++) {

    }
    return numberConnectedComponents;
  }

  public void proceed() throws IOException {
    int n = nextInt(), e = nextInt();
    boolean[] visited = new boolean[n];
    graph = new ArrayList<ArrayList<Integer>>(n);
    for (int i = 0; i < n; i++)
      graph.add(new ArrayList<>());

    for (int i = 0; i < e; i++) {
      int from = nextInt(), to = nextInt();
      graph.get(from).add(to);
      graph.get(to).add(from);
    }

    dfs(0, visited, graph);
  }


  public static void main(String[] args) throws IOException {
    new DepthFirstSearch().run();
  }

  public void run() {
    try {
      reader = new BufferedReader(new InputStreamReader(System.in));
      writer = new PrintWriter(System.out);
      tokenizer = null;
      proceed();
      reader.close();
      writer.close();
    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }

  int nextInt() throws IOException {
    return  Integer.parseInt(nextToken());
  }

  String nextToken() throws IOException {
    while (tokenizer == null || !tokenizer.hasMoreTokens())
      tokenizer = new StringTokenizer(reader.readLine());
    return tokenizer.nextToken();
  }
}
