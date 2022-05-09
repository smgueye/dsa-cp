package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF404_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    String[] tab = new String[n];
    for (int i = 0; i < n; i++) {
      tab[i] = reader.readLine();
    }
    HashSet<Character> diagonalElements = new HashSet<Character>();
    HashSet<Character> otherElements = new HashSet<Character>();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        char charAt = tab[i].charAt(j);
        if (i == j || i == n - 1 - j)
          diagonalElements.add(charAt);
        else {
          otherElements.add(charAt);
        }
      }
    }

    if (diagonalElements.size() == 1 && otherElements.size() == 1) {
      if (diagonalElements.iterator().next() != otherElements.iterator().next())
        writer.println("YES");
      else
        writer.println("NO");
    } else {
      writer.println("NO");
    }
  }

  public static void main(String[] args) {
    new CF404_D2_A().run();
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