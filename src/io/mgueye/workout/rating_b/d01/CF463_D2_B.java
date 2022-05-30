package io.mgueye.workout.rating_b.d01;

import java.io.*;
import java.util.*;

public class CF463_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++)
      h[i] = nextInt();

    int cumulativeEnergy = 0, dollars = h[0];
    for (int i = 1; i < n; i++) {
      cumulativeEnergy += (h[i-1] - h[i]);
      if(cumulativeEnergy < 0) {
        dollars += Math.abs(cumulativeEnergy);
        cumulativeEnergy = 0;
      }
    }
    writer.println(dollars);
  }

  public static void main(String[] args) {
    new CF463_D2_B().run();
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
