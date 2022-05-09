package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF382_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    String scale = reader.readLine();
    int middle = scale.indexOf('|');
    StringBuilder left = new StringBuilder(scale.substring(0, middle));
    StringBuilder right = new StringBuilder(scale.substring(middle + 1, scale.length()));
    String task = reader.readLine();
    for (int i = 0; i < task.length(); i++) {
      if(left.length() <= right.length()) left.append(task.charAt(i));
      else right.append(task.charAt(i));
    }
    writer.println(left.length() == right.length() ? left+"|"+right : "Impossible");
  }

  public static void main(String[] args) {
    new CF382_D2_A().run();
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