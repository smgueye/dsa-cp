package io.mgueye.workout.rating_b;

import java.io.*;
import java.util.*;

public class CF476_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    String s1 = reader.readLine();
    String s2 = reader.readLine();
    int[] cntPlus = new int[2], cntMinus = new int[2];
    int cntUnknown = 0, s1LastPosition = 0, s2LastPosition = 0;

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == '+') {
        cntPlus[0] += 1;
        s1LastPosition++;
      } else {
        cntMinus[0] += 1;
        s1LastPosition--;
      }
    }

    for (int i = 0; i < s2.length(); i++) {
      if(s2.charAt(i) == '+') {
        cntPlus[1] += 1;
        s2LastPosition++;
      }
      else if (s2.charAt(i) == '-') {
        cntMinus[1] += 1;
        s2LastPosition--;
      }
      else cntUnknown++;
    }
    if (s1LastPosition == s2LastPosition && cntUnknown == 0) {
      writer.println(String.format("%.12f", 1.0));
      return;
    }

    if (cntMinus[1] > cntMinus[0] || cntPlus[1] > cntPlus[0]){
      writer.println(String.format("%.12f", 0.0));
      return;
    }

    writer.printf("nCr(%d, 2)=%d, total cases: %f\n",  s1.length(), nCr( s1.length(), 2), Math.pow(2, s1.length()));
    writer.println(String.format("%.12f", nCr(s1.length(), 2) / Math.pow(2, s1.length())));
  }

  long nCr(long n, long r) {
    long ans = 1;
    for (int i = 1; i <= (n - r + 1); i++) {
      ans *= i;
    }
    for (int i = 1; i <= r; i++) {
      ans /= i;
    }
    return ans;
  }

  public static void main(String[] args) {
    new CF476_D2_B().run();
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

  public boolean ready() throws IOException {
    return reader.ready() || tokenizer.hasMoreTokens();
  }
}