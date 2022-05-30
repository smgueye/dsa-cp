package io.mgueye.workout.rating_b.d02;

import java.io.*;
import java.util.*;

public class CF451_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    long[] a = new long[n];
    long[] b = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = nextLong();
      b[i] = a[i];
    }
    Arrays.sort(b);

    Map<Long, Long> positions = new HashMap<>();
    for (int i = 0; i < n; i++)
      positions.put(b[i], (long) i);
    for (int i = 0; i < n; i++)
      a[i] = positions.get(a[i]);

    long left = -1;
    for (int i = 0; i < n; i++) {
      if(a[i] == i) continue;
      left = i;
      break;
    }

    long right = -1;
    for (int i = n-1; i >= 0; i--) {
      if(a[i] == i) continue;
      right = i;
      break;
    }

    if (left == -1 || right == -1) {
      writer.println("yes");
      writer.printf("%d %d\n", 1, 1);
    } else {
      reverse(a, left, right);
      boolean ok = true;
      for (int i = 0; i < n; i++) {
        if(a[i] == i) continue;
        ok = false;
        break;
      }
      if (ok) {
        writer.println("yes");
        writer.printf("%d %d\n", left + 1, right + 1);
      } else {
        writer.println("no");
      }
    }
  }

  void reverse(long[] a, long start, long end) {
    while (start < end){
      long temp = a[(int) start];
      a[(int) start] = a[(int) end];
      a[(int) end] = temp;
      start++; end--;
    }
  }

  public static void main(String[] args) {
    new CF451_D2_B().run();
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