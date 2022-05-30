package io.mgueye.workout.rating_b.d02;

import java.io.*;
import java.util.*;


// TODO: To review.
public class CF810_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt(), f = nextInt();
    long[] k = new long[n];
    long[] l = new long[n];

    int K = 1, V = 0;
    long[][] data = new long[n][n];
    for (int i = 0; i < n; i++) {
      k[i] = nextLong();
      l[i] = nextLong();
      data[i] = new long[]{Math.min(2*k[i], l[i]), i};
    }

    // TODO: Review this also: Collections.sort(data, (a, b) -> (int) (b - a[0]));

    long ans = 0;
    for (int i = 0; i < f; i++) {
      int pos = (int) data[i][K];
      ans += Math.min(2 * k[pos], l[pos]);
    }
    for (int i = f; i < n; i++) {
      int pos = (int) data[i][K];
      ans += Math.min(k[pos], l[pos]);
    }
    writer.println(ans);
  }

  public static void main(String[] args) {
    new CF810_D2_B().run();
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

class Day implements Comparable<Day> {
  int k, l, x;

  public Day(int k, int l) {
    this.k = k;
    this.l = l;
    this.x = Math.min(2*k, l);
  }

  @Override
  public int compareTo(Day d) {
    if(d.x != x) return d.x - x;
    if(d.k != k) return d.k - k;
    return d.l - l;

  }
}