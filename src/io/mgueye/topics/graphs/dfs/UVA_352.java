package io.mgueye.topics.graphs.dfs;

import java.io.*;
import java.util.*;

public class UVA_352 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private int size;
  private int countWarEagles = 0;

  private int[] dr = new int[]{-1, +1, 0, 0, +1, +1, -1, -1};
  private int[] dc = new int[]{0, 0, +1, -1, +1, -1, +1, -1};

  private void solve() throws IOException {
    int t = 1;
    while (true) {
      size = nextInt();
      int[][] grid = new int[size][size];
      boolean[][] visited = new boolean[size][size];
      for (int i = 0; i < size; i++) {
        Arrays.fill(visited[i], false);
        String line = reader.readLine();
        for (int j = 0; j < size; j++)
          grid[i][j] = line.charAt(j) == '1' ? 1 : 0;
      }

      exploreGrid(visited, grid);

      writer.printf("Image number %d contains %d war eagles.\n", t, countWarEagles);
      countWarEagles = 0;
      t++;
      if (!ready())
        break;
    }
    writer.flush();
    writer.close();
  }

  void exploreGrid(boolean[][] visited, int[][] grid) {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (visited[i][j]) continue;
        DFS(i, j, true, visited, grid);
      }
    }
  }

  void DFS(int row, int col, boolean isOriginalAncestor, boolean[][] visited, int[][] grid) {
    if (!isValidCell(row, col) || visited[row][col] || grid[row][col] == 0) return;

    visited[row][col] = true;

    ArrayList<Integer[]> nodes = furtherExploration(row, col, visited, grid);
    for (Integer[] node : nodes)
      DFS(node[0], node[1], false, visited, grid);

    if(isOriginalAncestor) {
      // writer.printf("Eagle: (%d, %d)\n", row, col);
      countWarEagles++;
    }
  }

  boolean isValidCell(int row, int col) {
    return (row >= 0 && row < size) && (col >= 0 && col < size);
  }

  ArrayList<Integer[]> furtherExploration(int row, int col, boolean[][] visited, int[][] grid) {
    ArrayList<Integer[]> nodes = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      int x = row + dr[i], y = col + dc[i];
      if (((x < 0 || x >= size) || (y < 0 || y >= size))) continue;
      if (grid[x][y] == 0) continue;
      if (visited[x][y]) continue;
      nodes.add(new Integer[]{x, y});
    }
    return nodes;
  }

  public static void main(String[] args) {
    new UVA_352().run();
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