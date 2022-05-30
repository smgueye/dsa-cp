// package io.mgueye.contests.CF794_D2;

import java.io.*;
import java.util.*;

public class TaskB {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int t = nextInt();
    while (t > 0) {
      int n = nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();

      int start = 0, count = 0;
      for (int end = 1; end < n; end++) {
        if (start == end) continue;
        if (a[start] > a[end]) {
          count++;
          start = end + 1;
          continue;
        }
        start++;
      }

      writer.println(count);
      t--;
    }
  }

  public static void main(String[] args) {
    new TaskB().run();
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
