package io.mgueye.workout.rating_b.w001;

import java.io.*;
import java.util.*;

public class CF227_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    int[] a = new int[n];
    int[] pos = new int[n+1];
    for (int i = 0; i < n; i++) {
      a[i] = nextInt();
      pos[a[i]] = i;
    }

    int m = nextInt();
    long x = 0, y = 0;
    for (int i = 0; i < m; i++) {
      int q = nextInt();
      x += pos[q] + 1;
      y += n - pos[q];
    }
    writer.println(x + " " + y);
  }

  public static void main(String[] args) {
    new CF227_D2_B().run();
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