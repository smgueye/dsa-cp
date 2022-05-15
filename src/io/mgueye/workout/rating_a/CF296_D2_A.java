// package io.mgueye.workout.rating_a;

import java.io.*;
import java.util.*;

public class CF296_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = nextInt();

    boolean isPossible = true;
    for (int i = 0; i < n; i++) {
      int freq = 0;
      for (int j = 0; j < n; j++)
        if (a[i] == a[j]) freq++;
      if (n < 2 * freq - 1) {
        isPossible = false;
        break;
      }
    }
    if(isPossible) writer.println("YES");
    else writer.println("NO");
  }

  public static void main(String[] args) {
    new CF296_D2_A().run();
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
