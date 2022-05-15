package io.mgueye.workout.rating_a;

import java.io.*;
import java.util.*;

public class CF298_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    long x = nextLong(), ans = 0;
    while (x > 0) {
      ans += (x % 2);
      x /= 2;
    }
    writer.println(ans);
  }

  public static void main(String[] args) {
    new CF298_D2_A().run();
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