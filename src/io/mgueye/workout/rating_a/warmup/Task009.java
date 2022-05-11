package io.mgueye.workout.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task009 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    char[] chars = reader.readLine().toCharArray();
    Arrays.sort(chars);
    int countLetters = 1;
    for (int i = 1; i < chars.length; i++)
      if (chars[i] != chars[i-1])
        countLetters++;
    if (countLetters % 2 == 0)
      writer.println("CHAT WITH HER!");
    else
      writer.println("IGNORE HIM!");
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task009().run();
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