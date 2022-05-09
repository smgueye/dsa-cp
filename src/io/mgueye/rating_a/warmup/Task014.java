package io.mgueye.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task014 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int[] calories = new int[4];
    for (int i = 0; i < 4; i++)
      calories[i] = nextInt();

    String gamePlan = reader.readLine();
    int totalCaloriesBurned = 0;
    for (int i = 0; i < gamePlan.length(); i++) {
      int index = Character.getNumericValue(gamePlan.charAt(i)) - 1;
      totalCaloriesBurned += calories[index];
    }
    writer.println(totalCaloriesBurned);
  }

  private void inspect(int[] values) {
    for (int value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task014().run();
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
