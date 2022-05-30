package io.mgueye.topics.graphs.dfs;

import java.io.*;
import java.util.*;


//TODO: Du to memory performances, I will implement the solution in iterative way.
public class UVA_10452 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  //                         {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z};
  char[] letters = new char[]{1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
  int[] startAt = new int[2];
  int[] endAt = new int[2];
  int M = 0;
  int N = 0;

  private void solve() throws IOException {
    int t = nextInt();
    while (t > 0) {
      M = nextInt();
      N = nextInt();

      boolean[][] visited = new boolean[M][N];
      char[][] grid = new char[M][N];
      String[] path = new String[8];

      Arrays.fill(path, null);
      for (int i = 0; i < M; i++) {
        String row = reader.readLine();
        Arrays.fill(visited[i], Boolean.FALSE);
        for (int j = 0; j < N; j++) {
          grid[i][j] = row.charAt(j);
          if(grid[i][j] == '@') {
            startAt[0] = i;
            startAt[1] = j;
          }
          if(grid[i][j] == '#') {
            endAt[0] = i;
            endAt[1] = j;
          }
        }
      }

      Deque<String> stack = new ArrayDeque<>();
      dfs(startAt[0], startAt[1], stack, path, visited, grid);
      writer.printf("%s", stack.pop());
      while (!stack.isEmpty())
        writer.printf(" %s", stack.pop());
      writer.printf("\n");
      t--;
    }
  }

  boolean dfs(int row, int col, Deque<String> stack, String[] path, boolean[][] visited, char[][] grid) {
    // writer.printf("params->(%d, %d) is %s \n", row, col, isValid(row, col, grid) ? "VALID": "INVALID");
    if (!isValid(row, col, grid) || visited[row][col])
      return false;

    if(grid[row][col] == '#') return true;

    visited[row][col] = true;

    boolean rightIsOk = dfs(row, col + 1, stack, path, visited, grid);
    boolean leftIsOk = dfs(row, col - 1, stack, path, visited, grid);
    boolean topIsOk = dfs(row - 1, col, stack, path, visited, grid);

    if (rightIsOk) {
      stack.push("right");
      return true;
    }
    if (leftIsOk) {
      stack.push("left");
      return true;
    }
    if (topIsOk) {
      stack.push("forth");
      return true;
    }
    return false;
  }

  boolean isValid(int row, int col, char[][] grid) {
    boolean boundariesValid = (row >= 0 && row < M) && (col >= 0 && col < N);
    if (!boundariesValid) return false;
    if(grid[row][col] == '@' || grid[row][col] == '#') return true;
    if (letters[grid[row][col] - 'A'] == 1) return true;
    return false;
  }

  public static void main(String[] args) {
    new UVA_10452().run();
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