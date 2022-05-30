package io.mgueye.workout.rating_b.d02;

import java.io.*;
import java.util.*;

public class CF88_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private int getDistance(Coords pt, Coords shift) {
    return (int) (Math.pow(pt.getX() - shift.getX(), 2) + Math.pow(pt.getY() - shift.getY(), 2));
  }

  private void solve() throws IOException {
    int n = nextInt(), m = nextInt(), x = nextInt();
    Coords[] keyDsts = new Coords[26];
    ArrayList<Coords> shifts = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String chars = reader.readLine();
      for (int j = 0; j < m; j++) {
        char c = chars.charAt(j);
        if (c == 'S') shifts.add(new Coords(i, j));
        else keyDsts[c - 'a'] = new Coords(i, j);
      }
    }
    reader.readLine();
    String txt = reader.readLine();

    int dsts[] = new int[26];
    Arrays.fill(dsts, -1);
    for (int i = 0; i < 26; i++) {
      if(keyDsts[i] == null) continue;
      dsts[i] = Integer.MAX_VALUE;
      for (Coords shift: shifts) {
        dsts[i] = Math.min(dsts[i], getDistance(keyDsts[i], shift));
      }
    }

    int count = 0;
    boolean isPossibleToType = true;
    for (int i = 0; i < txt.length(); i++) {
      if('a' <= txt.charAt(i) && txt.charAt(i) <= 'z') {
        int c = dsts[txt.charAt(i) - 'a'];
        if(c == -1)
          isPossibleToType = false;
        continue;
      }
      if(shifts.size() == 0) {
        isPossibleToType = false;
        continue;
      }
      int dst = dsts[txt.charAt(i) - 'A'];
      if(dst == -1) {
        isPossibleToType = false;
        continue;
      }
      if(dst <= (x * x)) continue;
      count++;
    }

    writer.println(isPossibleToType ? count : -1);
  }

  public static void main(String[] args) {
    new CF88_D2_B().run();
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

class Coords {
  int x;
  int y;

  public Coords(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}