package io.mgueye.workout.rating_b;

import java.io.*;
import java.util.*;

public class CF94_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int e = nextInt(), v = nextInt();

    if (v == 0) {
      writer.println(0);
      return;
    }

    ArrayList<ArrayList<Integer>> graph = new ArrayList<>(e);
    for (int i = 0; i < e; i++)
      graph.add(new ArrayList<>());

    for (int i = 0; i < v; i++)
      addEdge(nextInt() - 1, nextInt() - 1, graph);

    ArrayList<Integer> degrees = new ArrayList<>(e),
                       leaves = new ArrayList<>();

    for (int i = 0; i < e; i++) {
      ArrayList<Integer> nodes = graph.get(i);
      degrees.add(nodes.size());
      if(degrees.get(i) > 1) continue;
      leaves.add(i);
    }

    int nbProcessedLeaves = leaves.size();
    int nbGroups = 0;
    while (leaves.size() > 0 && nbProcessedLeaves < e) {
      ArrayList<Integer> newLeaves = new ArrayList<>();
      for (Integer node : leaves) {
        for (Integer neighbor : graph.get(node)) {
          degrees.set(neighbor, degrees.get(neighbor) - 1);
          if (degrees.get(neighbor) == 1)
            newLeaves.add(neighbor);
        }
        degrees.set(node, 0);
      }
      nbProcessedLeaves += newLeaves.size();
      leaves = newLeaves;
      nbGroups++;
    }

    writer.println(leaves.size() + " / " + nbGroups);
    writer.println(leaves.size() > 0 &&
        leaves.size() % 2 == 0 ? nbGroups + 1 : nbGroups);
  }

  public void addEdge(int src, int dst, ArrayList<ArrayList<Integer>> graph) {
    graph.get(src).add(dst);
    graph.get(dst).add(src);
  }

  public static void main(String[] args) {
    new CF94_D2_B().run();
  }

  public void run() {
    try {
      reader = new BufferedReader(new InputStreamReader(System.in));
      writer = new PrintWriter(System.out);
      tokenizer = null;
      solve();
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

  long nextLong() throws IOException {
    return Long.parseLong(nextToken());
  }

  double nextDouble() throws IOException {
    return Double.parseDouble(nextToken());
  }

  String nextToken() throws IOException {
    while (tokenizer == null || !tokenizer.hasMoreTokens())
      tokenizer = new StringTokenizer(reader.readLine());
    return tokenizer.nextToken();
  }

  public boolean ready() throws IOException {
    return reader.ready() || tokenizer.hasMoreTokens();
  }
}