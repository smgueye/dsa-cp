package io.mgueye.workout.rating_b.w001;

import java.io.*;
import java.util.*;

public class CF102_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    String n = reader.readLine();
    if (n.length() == 1) {
      writer.println(0);
      return;
    }
    int x = 11, counter = 0;
    while (x >= 10) {
      x = 0;
      for (int i = 0; i < n.length(); i++) {
        x += (n.charAt(i) - '0');
      }
      n = Integer.toString(x);
      counter++;
    }
    writer.println(counter);
  }

  private int getNbDigits(long n) {
    if (n == 0) return 1;
    return (int) Math.floor(Math.log10(n)) + 1;
  }

  public static void main(String[] args) {
    new CF102_D2_B().run();
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