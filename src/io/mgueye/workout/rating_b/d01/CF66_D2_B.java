package io.mgueye.workout.rating_b.d01;

import java.io.*;
import java.util.*;

public class CF66_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = nextInt();
    int maxNbSections = 1;
    for (int i = 0; i < n; i++) {
      int currentNbSections = 1;
      int j = i - 1, h = a[i];
      while (j >= 0 && a[j] <= h) {
        currentNbSections++;
        h = a[j];
        j--;
      }
      j = i + 1;
      h = a[i];
      while (j < n && a[j] <= h) {
        currentNbSections++;
        h = a[j];
        j++;
      }
      maxNbSections = Math.max(maxNbSections, currentNbSections);
    }
    writer.println(maxNbSections);
  }

  public static void main(String[] args) {
    new CF66_D2_B().run();
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