package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF43_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    String winner = null;
    HashMap<String, Integer> teamsMap = new HashMap<>();
    while (n > 0) {
      String team = reader.readLine();
      if (teamsMap.containsKey(team))
        teamsMap.put(team, teamsMap.get(team) + 1);
      else
        teamsMap.put(team, 1);
      int score = 0;
      for(String k : teamsMap.keySet())
        if (teamsMap.get(k) > score) {
          score = teamsMap.get(k);
          winner = k;
        }
      n--;
    }
    writer.println(winner);
  }

  public static void main(String[] args) {
    new CF43_D2_A().run();
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
