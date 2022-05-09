package io.mgueye.rating_a;

import java.io.*;
import java.util.*;


public class CF807_D2_A {

  static final int START = 0;
  static final int END = 1;

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    int[][] ratings = new int[n][2];
    for (int i = 0; i < n; i++) {
      ratings[i][START] = nextInt();
      ratings[i][END] = nextInt();
    }
    boolean hasScoreGreaterThanPrevious = false;
    for (int i = 0; i < n; i++) {
      if(ratings[i][START] != ratings[i][END]){
        writer.println("rated");
        return;
      }
      if (i > 0 && (
        ratings[i][START] == ratings[i][END] &&
        ratings[i][START] > ratings[i - 1][START])) {
        hasScoreGreaterThanPrevious = true;
      }
    }
    writer.println(hasScoreGreaterThanPrevious ? "unrated" : "maybe");
  }

  private void inspect(int[][] values) {
    for (int[] value : values)
      writer.println(value[START] + ", " + value[END]);
    writer.println();
  }

  public static void main(String[] args) {
    new CF807_D2_A().run();
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