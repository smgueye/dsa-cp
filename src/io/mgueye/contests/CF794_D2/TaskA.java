package io.mgueye.contests.CF794_D2;

import java.io.*;
import java.util.*;

public class TaskA {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int t = nextInt();
    while (t > 0) {
      int n = nextInt(), sum = 0;
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = nextInt();
        sum += a[i];
      }

      boolean flag = false;
      for (int i = 0; i < n; i++) {
        double mean = (double) (sum - a[i]) / (n - 1);
        boolean isNotDouble = mean % 1 == 0;
        if(isNotDouble && mean == a[i]) {
          flag = true;
          break;
        }
      }
      writer.println(flag ? "YES" : "NO");
      t--;
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