package io.mgueye.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task002 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int N = nextInt();
    String scores = reader.readLine();
    int antonScore = 0, danikScore = 0, i = 0;
    while(N > 0) {
      if (scores.charAt(i) == 'A')
        antonScore += 1;
      if (scores.charAt(i) == 'D')
        danikScore += 1;
      i++;
      N--;
    }

    if (antonScore > danikScore)
      writer.println("Anton");
    else if (antonScore < danikScore)
      writer.println("Danik");
    else
      writer.println("Friendship");
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task002().run();
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
