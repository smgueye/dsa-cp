package io.mgueye.workout.rating_b.w001;

import java.io.*;
import java.util.*;

public class CF78_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();

    String[] complements = {"", "G", "GB", "GBI", "GBIV"};
    StringBuilder colors = new StringBuilder("ROYGBIV");

    n -= 7;
    while (n > 0) {
      String complement = n >= 4 ? complements[4] : complements[n];
      colors.append(complement);
      n -= complement.length();
    }
    writer.println(colors);
  }

  public static void main(String[] args) {
    new CF78_D2_B().run();
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
