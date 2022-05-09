package io.mgueye.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task006 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int N = nextInt();
    int[] array = new int[N];
    for(int i = 0; i < N; i++) {
      array[i] = nextInt();
    }
    Arrays.sort(array);
    for (int value : array)
      writer.print(value + " ");
  }

  private void inspect(int[][] values) {
    for (int[] array : values) {
      for (int value : array)
        writer.print(value + ", ");
      writer.println();
    }
  }

  public static void main(String[] args) {
    new Task006().run();
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
