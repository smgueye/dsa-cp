package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF514_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    long x = nextLong();
    StringBuilder ans = new StringBuilder();
    while (x > 0) {
      long d = x % 10;
      x /= 10;
      if (x == 0 && d == 9) {
        ans.append(9);
        break;
      }
      ans.append(Math.min(d, 9 - d));
    }
    writer.println(ans.reverse());
  }

  public static void main(String[] args) {
    new CF514_D2_A().run();
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