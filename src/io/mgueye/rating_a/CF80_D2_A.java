// package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF80_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    Boolean[] isPrime = buildPrimesTab(51);

    int a = nextInt();
    int b = nextInt();

    for (int i = (int) (a + 1); i < 51; i++) {
      if (!isPrime[i]) {
        if (i > b) {
          writer.println("NO");
          return;
        }
        continue;
      }

      if (i == b) {
        writer.println("YES");
        return;
      }
      writer.println("NO");
      return;
    }
    writer.println("NO");
  }

  static Boolean[] buildPrimesTab(int n) {
    Boolean[] isPrime = new Boolean[(int) (n + 1)];
    Arrays.fill(isPrime, true);
    for (int i = 2; i * i <= n ; i++) {
      if(isPrime[i]) {
        for (int j = 2 * i; j <= n; j += i) {
          isPrime[j] = false;
        }
      }
    }
    return isPrime;
  }

  public static void main(String[] args) {
    new CF80_D2_A().run();
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