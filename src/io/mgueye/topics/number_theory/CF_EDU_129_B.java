package io.mgueye.topics.number_theory;

import java.io.*;
import java.util.*;

public class CF_EDU_129_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int t = nextInt();
    while (t > 0) {
      int n = nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      int m = nextInt();
      int ans = -1, pos = 0;
      for (int i = 0; i < m; i++) {
        int b = nextInt();
        if (ans == -1) {
          pos = (i + 1 + b) % n;
          ans = pos == 0 ? n : pos;
          continue;
        }
        pos = (ans + b) % n;
        ans = pos;
      }
      writer.println(a[pos == 0 ? n - 1 : pos - 1]);
      t--;
    }
  }

  public static void main(String[] args) {
    new CF_EDU_129_B().run();
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