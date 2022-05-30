package io.mgueye.contests.CF792_D2;

import java.io.*;
import java.util.*;

public class TaskA {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    while (n > 0) {
      char[] x = reader.readLine().toCharArray();
      if (x.length == 2) writer.println(x[1]);
      else {
        Arrays.sort(x);
        writer.println(x[0]);
      }
      n--;
    }
  }

  public static void main(String[] args) {
    new TaskA().run();
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

  public boolean ready() throws IOException {
    return reader.ready() || tokenizer.hasMoreTokens();
  }
}
