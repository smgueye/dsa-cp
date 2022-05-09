package io.mgueye.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task011 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int N = nextInt();
    int serejaPoints = 0, dimaPoints = 0;
    int[] cardNumbers = new int[N];
    for (int i = 0; i < N; i++)
      cardNumbers[i] = nextInt();
    int left = 0, right = cardNumbers.length - 1;
    boolean isSerejaTurn = true;
    while(left <= right) {
      int points = 0;
      if (cardNumbers[left] >= cardNumbers[right]) {
        points = cardNumbers[left];
        left += 1;
      }
      else {
        points = cardNumbers[right];
        right -= 1;
      }
      if (isSerejaTurn) {
        serejaPoints += points;
        isSerejaTurn = false;
      }
      else {
        dimaPoints += points;
        isSerejaTurn = true;
      }
    }

    writer.println(serejaPoints + " " + dimaPoints);
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task011().run();
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
