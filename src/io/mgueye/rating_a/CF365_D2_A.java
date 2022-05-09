package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF365_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt(), k = nextInt(), count = 0;

    while(n > 0) {
      int[] integers = new int[k+10];
      Arrays.fill(integers, -1);
      int x = nextInt();
      while (x > 0) {
        int d = x % 10;
        integers[d] = 1;
        x /= 10;
      }
      boolean isOk = true;
      for (int i = 0; i <= k; i++) {
        if (integers[i] == 1) continue;
        isOk = false;
        break;
      }
      if(isOk) count++;
      n--;
    }
    writer.println(count);
  }

  public static void main(String[] args) {
    new CF365_D2_A().run();
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