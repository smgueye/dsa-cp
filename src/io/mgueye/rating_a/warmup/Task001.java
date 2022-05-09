package io.mgueye.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task001 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int N = nextInt();
    int H = nextInt();
    int width = 0;
    for (int i = 0; i < N; i++) {
      int currentWidth = nextInt();
      if (currentWidth <= H)
        width += 1;
      else
        width += 2;
    }
    writer.println(width);
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task001().run();
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