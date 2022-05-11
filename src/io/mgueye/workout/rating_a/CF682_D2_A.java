package io.mgueye.workout.rating_a;

import java.io.*;
import java.util.*;

public class CF682_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    long m = nextInt(), n = nextInt();

    long[] a = new long[5], b = new long[5];
    Arrays.fill(a, 0);
    Arrays.fill(b, 0);
    for (int i = 1; i <= m; i++)
      a[i % 5]++;
    for (int i = 1; i <= n; i++) {
      b[i % 5]++;
    }
    writer.println(a[0]*b[0] + a[1]*b[4] + a[2]*b[3] + a[3]*b[2] + a[4]*b[1]);
  }

  public static void main(String[] args) {
    new CF682_D2_A().run();
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