package io.mgueye.workout.rating_b.d02;

import java.io.*;
import java.util.*;

public class CF766_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = nextLong();
    }

    Arrays.sort(a);
    for (int i = 2; i < n; i++) {
      boolean isOk = isGoodCombination(a, i);
      if(!isOk) continue;
      writer.println("YES");
      return;
    }

    writer.println("NO");
  }

  boolean isGoodCombination(long[] a, int index) {
    boolean conditionOne = a[index] < a[index - 1] + a[index - 2];
    boolean conditionTwo = a[index - 1] < a[index] + a[index - 2];
    boolean conditionThee = a[index - 2] < a[index - 1] + a[index];
    return conditionOne && conditionTwo && conditionThee;
  }

  public static void main(String[] args) {
    new CF766_D2_B().run();
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