package io.mgueye.workout.rating_a;
import java.io.*;
import java.util.*;

public class CF584_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    long n = nextInt();
    long t = nextInt();
    if (n == 1 && t == 10)
      writer.println(-1);
    else {
      String s = String.valueOf(t);
      StringBuilder ans = new StringBuilder(s);
      for (int i = 1; i <= (n - s.length()) ; i++)
        ans.append("0");
      writer.println(ans.toString());
    }
  }

  public static void main(String[] args) {
    new CF584_D2_A().run();
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