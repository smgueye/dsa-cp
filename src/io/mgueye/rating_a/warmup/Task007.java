package io.mgueye.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task007 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    String a = reader.readLine();
    String b = reader.readLine();
    int size = a.length();
    boolean flag = true;
    for (int i = 0; i < size; i++) {
      char charA = Character.toLowerCase(a.charAt(i));
      char charB = Character.toLowerCase(b.charAt(i));
      if (charA < charB) {
        flag = false;
        writer.println(-1);
        break;
      }
      if (charA > charB) {
        flag = false;
        writer.println(1);
        break;
      }
    }
    if (flag)
      writer.println(0);
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task007().run();
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
