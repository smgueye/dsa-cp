package io.mgueye.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task015 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    String exhibits = reader.readLine();
    int rotationNumbers = 0, x = 0;
    for (int i = 0; i < exhibits.length(); i++) {
      int y = (int)exhibits.charAt(i) - (int)'a';
      rotationNumbers += Math.min(Math.abs(x - y), 26 - Math.abs(x - y));
      x = y;
    }
    writer.println(rotationNumbers);
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task015().run();
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
