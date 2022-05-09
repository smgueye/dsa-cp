// package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF287_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  boolean isOk(int i, int j, String[] p) {
    int c = 0;
    if (p[i].charAt(j) != p[i].charAt(j-1)) c++;
    if (p[i].charAt(j) != p[i-1].charAt(j)) c++;
    if (p[i].charAt(j) != p[i-1].charAt(j-1)) c++;
    return c <= 1;
  }

  private void solve() throws IOException {
    String[] paper = new String[4];
    paper[0] = reader.readLine();
    paper[1] = reader.readLine();
    paper[2] = reader.readLine();
    paper[3] = reader.readLine();
    for (int i = 1; i < 4; i++) {
      for (int j = 1; j < 4; j++) {
        boolean ok = isOk(i, j, paper);
        if(ok) {
          writer.println("YES");
          return;
        }
      }
    }
    writer.println("NO");
  }

  public static void main(String[] args) {
    new CF287_D2_A().run();
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