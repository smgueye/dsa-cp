package io.mgueye.workout.rating_b.w001;

import java.io.*;
import java.util.*;

public class CF746_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    String encoded = reader.readLine();
    boolean isEven = n % 2 == 0;

    String ans = String.valueOf(encoded.charAt(0));
    char direction = !isEven ? 'L' : 'R';
    int cursor = 1;
    while (cursor < n) {
      if (direction == 'L')
        ans = encoded.charAt(cursor) + ans;
      else
        ans += encoded.charAt(cursor);
      direction = direction == 'L' ? 'R' : 'L';
      cursor++;
    }

    writer.println(ans);
  }

  public static void main(String[] args) {
    new CF746_D2_B().run();
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