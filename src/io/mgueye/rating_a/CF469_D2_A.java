package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF469_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    int[] A = new int[n + 1];
    Arrays.fill(A, 0);
    int p = nextInt();
    for (int i = 0; i < p; i++)
      A[nextInt()] = 1;

    int q = nextInt();
    for (int i = 0; i < q; i++)
      A[nextInt()] = 1;
    boolean f = true;
    for (int i = 1; i <= n; i++) {
      if (A[i] == 0) {
        f = false;
        break;
      }
    }
    if (f) writer.println("I become the guy.");
    else writer.println("Oh, my keyboard!");
  }
  public static void main(String[] args) {
    new CF469_D2_A().run();
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