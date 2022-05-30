package io.mgueye.contests.CF794_D2;

import java.io.*;
import java.util.*;

public class TaskC {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int t = nextInt();
    while (t > 0) {
      int n = nextInt();
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();

      Arrays.sort(a);
      int nbEqualElement = 1;
      for (int i = 1; i < n; i++) {
        if (a[i] != a[i - 1]) continue;
        nbEqualElement++;
      }

      if (nbEqualElement > (n - nbEqualElement)) {
        writer.println("NO");
        t--;
        continue;
      }

      long[] b = new long[n];
      boolean isOdd = n % 2 != 0;
      int l = (int) Math.floor((double) n / 2);
      int p = 0, q = isOdd ? l + 1: l, k = 0;
      boolean f = true;
      while (k < n) {
        if (p == q) {
          b[k] = a[q];
          break;
        }
        if(f) {
          b[k] = a[p]; p++;
        } else {
          b[k] = a[q]; q++;
        }
        f = !f;
        k++;
      }

      writer.println("YES");
      writer.print(b[0]);
      for (int i = 1; i < n; i++) {
        writer.print(" " + (b[i]));
      }
      writer.print("\n");
      t--;
    }
  }

  public static void main(String[] args) {
    new TaskC().run();
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