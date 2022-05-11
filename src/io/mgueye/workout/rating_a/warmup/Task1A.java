package io.mgueye.workout.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task1A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int size = nextInt();
    int[][] vectors = new int[size][];
    for (int i = 0; i < size; i++) {
      vectors[i] = new int[3];
      for (int j = 0; j < 3; j++)
        vectors[i][j] = nextInt();
    }

    int sum = 0;
    for (int col = 0; col < 3; col++) {
      for (int row = 0; row < size; row++) {
        sum += vectors[row][col];
      }
    }
    if (sum == 0) writer.println("YES");
    else writer.println("NO");
  }

  private void inspect(int[][] values) {
    for (int[] items : values) {
      for (int value : items)
        writer.print(value + ", ");
      writer.println();
    }
  }

  public static void main(String[] args) {
    new Task1A().run();
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
