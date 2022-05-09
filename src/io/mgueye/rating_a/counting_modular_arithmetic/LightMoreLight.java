package io.mgueye.rating_a.counting_modular_arithmetic;

import java.io.*;
import java.util.*;


// Uva - 10110
class LightMoreLight {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    while (true) {
      int N = Integer.parseInt(reader.readLine());
      if (N == 0) return;
      if (N == 1) {
        writer.println("yes");
        continue;
      }
      double sqrt = Math.sqrt(N);
      boolean isPerfectSquare = sqrt - Math.floor(sqrt) == 0;
      writer.println(isPerfectSquare ? "yes" : "no");
    }
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new LightMoreLight().run();
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
