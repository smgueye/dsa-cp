// package io.mgueye.workout.rating_a;

import java.io.*;
import java.util.*;

public class CF1237_D12_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = nextInt();
    int flag = 1;
    for (int i = 0; i < n; i++) {
      if (a[i] % 2 == 0) writer.println(a[i] / 2);
      else {
        writer.println((a[i] + flag) / 2);
        flag *= -1;
      }
    }
  }

  public static void main(String[] args) {
    new CF1237_D12_A().run();
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