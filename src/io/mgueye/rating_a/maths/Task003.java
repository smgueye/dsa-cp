package io.mgueye.rating_a.maths;

import java.io.*;
import java.util.*;

public class Task003 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    String txt = reader.readLine();
    String instructions = reader.readLine();
    int i = 0, j = 0, k = 1;
    while (i < txt.length() && j < instructions.length()){
      if(txt.charAt(i) == instructions.charAt(j))
        i++;
      j++;
    }
    writer.println(i+1);
  }

  public static void main(String[] args) {
    new Task003().run();
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

