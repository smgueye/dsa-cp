package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF143_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  boolean isInRange(int x) {
    return 1 <= x && x <= 9;
  }

  private void solve() throws IOException {
    int r1 = nextInt(), r2 = nextInt(),
        c1 = nextInt(), c2 = nextInt(),
        d1 = nextInt(), d2 = nextInt();
    int a = (d2 - r1 - c1) / 2 * -1,
      b = r1 - a,
      c = d2 - b,
      d = r2 - c;
    HashSet<Integer> solutions = new HashSet<>(){{
      add(a);
      add(b);
      add(c);
      add(d);
    }};
    if (a + b != r1 || c + d != r2 || a + c != c1 || b + d != c2 || a + d != d1 || b + c != d2)
      writer.println(-1);
    else {
      if (solutions.size() <= 3 || (!isInRange(a) || !isInRange(b) || !isInRange(c) || !isInRange(d))) {
        writer.println(-1);
      } else {
        writer.println(a + " " + b);
        writer.println(c + " " + d);
      }
    }
  }

  public static void main(String[] args) {
    new CF143_D2_A().run();
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