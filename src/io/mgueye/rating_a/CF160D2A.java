package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF160D2A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
   int n = nextInt(), total = 0;
   int[] coins = new int[n];
    for (int i = 0; i < n; i++) {
      coins[i] = nextInt();
      total += coins[i];
    }
    total /= 2;
    Arrays.sort(coins);
    int countPieces = 0, sum = 0;
    for (int i = n-1; i >= 0; i--) {
      sum += coins[i];
      if (sum > total) {
        countPieces++;
        break;
      }
      countPieces++;
    }

    writer.println(countPieces);
  }

  private void inspect(int[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new CF160D2A().run();
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