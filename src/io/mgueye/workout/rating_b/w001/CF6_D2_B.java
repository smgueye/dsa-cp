package io.mgueye.workout.rating_b.w001;

import java.io.*;
import java.util.*;

public class CF6_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt(), m = nextInt();
    char c = nextToken().charAt(0);
    String[] plan = new String[n];
    for (int i = 0; i < n; i++) {
      plan[i] = nextToken();
    }
    // TODO: To be continue...
  }

  public static void main(String[] args) {
    new CF6_D2_B().run();
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

  char nextChar() throws IOException {
    return nextToken().charAt(0);
  }

  String nextToken() throws IOException {
    while (tokenizer == null || !tokenizer.hasMoreTokens())
      tokenizer = new StringTokenizer(reader.readLine());
    return tokenizer.nextToken();
  }
}