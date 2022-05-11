package io.mgueye.workout.rating_a;

import java.io.*;
import java.util.*;

public class CF699_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    String symbols = reader.readLine();
    int[] x = new int[n];
    for (int i = 0; i < n; i++)
      x[i] = nextInt();
    int ans = Integer.MAX_VALUE;
    for (int i = 1; i < n; i++) {
      boolean merging = symbols.charAt(i) == 'L' && symbols.charAt(i-1) == 'R';
      if(merging)
        ans = Math.min(ans, Math.abs(x[i] - x[i-1]) / 2);
    }
    writer.println((ans == Integer.MAX_VALUE) ? -1 : ans);
  }

  public static void main(String[] args) {
    new CF699_D2_A().run();
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