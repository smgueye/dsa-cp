package io.mgueye.workout.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task016 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int teamNumer = nextInt();
    int[][] teams = new int[teamNumer][2];
    int HOME = 0, AWAY = 1;
    int gameNumer = 0;
    for (int i = 0; i < teamNumer; i++) {
      teams[i][HOME] = nextInt();
      teams[i][AWAY] = nextInt();
    }
    for (int homeTeamIndex = 0; homeTeamIndex < teamNumer; homeTeamIndex++) {
      for (int awayTeamIndex = 0; awayTeamIndex < teamNumer; awayTeamIndex++) {
        if (homeTeamIndex == awayTeamIndex) continue;
        if(teams[homeTeamIndex][HOME] == teams[awayTeamIndex][AWAY])
          gameNumer++;
      }
    }
    writer.println(gameNumer);
  }

  public static void main(String[] args) {
    new Task016().run();
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
