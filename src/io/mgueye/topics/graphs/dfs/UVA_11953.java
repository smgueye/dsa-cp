package io.mgueye.topics.graphs.dfs;

import java.io.*;
import java.util.*;

public class UVA_11953 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  int[] dx = new int[]{+1, -1, 0 , 0};
  int[] dy = new int[]{0, 0, -1, +1};
  int numberShips = 0;
  int N = 0;

  private void solve() throws IOException {
    int t = nextInt();
    int caseId = 1;
    while (t > 0) {
      N = nextInt();

      boolean[][] visited = new boolean[N][N];
      char[][] grid = new char[N][N];
      for (int i = 0; i < N; i++) {
        String in = reader.readLine();
        for (int j = 0; j < N; j++)
          grid[i][j] = in.charAt(j);
      }

      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          if (visited[i][j] || grid[i][j] == '.' || grid[i][j] == '@') continue;
          search(i, j, visited, grid);
          numberShips++;
        }
      }

      /*for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++)
          writer.printf("%c,", grid[i][j]);
        writer.println();
      }

      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++)
          writer.printf("%b,", visited[i][j]);
        writer.println();
      }*/
      writer.printf("Case %d: %d\n", caseId, numberShips);
      numberShips = 0;
      caseId++;
      t--;
    }
  }

  void search(int rowIdx, int colIdx, boolean[][] visited, char[][] grid){
    if (!isValid(rowIdx, colIdx)
        || visited[rowIdx][colIdx]
        || grid[rowIdx][colIdx] == '.')
      return;

    visited[rowIdx][colIdx] = true;
    for (int i = 0; i < 4; i++) {
      int x = rowIdx + dx[i];
      int y = colIdx + dy[i];
      search(x, y, visited, grid);
    }
  }

  boolean isValid(int rowIdx, int colIdx) {
    return rowIdx >= 0 && rowIdx < N && colIdx >= 0 && colIdx < N;
  }

  public static void main(String[] args) {
    new UVA_11953().run();
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