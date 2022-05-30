package io.mgueye.topics.graphs;

import java.io.*;
import java.util.*;

public class ReachableCells {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private int M;
  private int N;
  private int validCellsCounter = 0;

  private void solve() throws IOException {
    int m = nextInt();
    int n = nextInt();
    M = m; N = n;
    char[][] grid = new char[m][n];
    for (int i = 0; i < m; i++) {
      String line = reader.readLine();
      for (int j = 0; j < n; j++)
        grid[i][j] = line.charAt(j);
    }

    boolean[][] visited = new boolean[m][n];
    countReachableCells(0, 0, visited, grid);
    writer.println(validCellsCounter);
  }

  boolean isCellValid(int row, int col) {
    return (row >= 0 && row < M) && (col >= 0 && col < N);
  }

  void countReachableCells(int row, int col, boolean[][] visited, char[][] grid) {
    if(!isCellValid(row, col) ||  grid[row][col] == 'x' || visited[row][col])
      return;

    visited[row][col] = true;
    validCellsCounter += 1;

    countReachableCells(row, col - 1, visited, grid);
    countReachableCells(row, col + 1, visited, grid);
    countReachableCells(row - 1, col, visited, grid);
    countReachableCells(row + 1, col, visited, grid);;
  }

  public static void main(String[] args) {
    new ReachableCells().run();
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
}
