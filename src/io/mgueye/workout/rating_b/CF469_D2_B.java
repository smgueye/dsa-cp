package io.mgueye.workout.rating_b;

import java.io.*;
import java.util.*;

public class CF469_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int p = nextInt(),
        q = nextInt(),
        l = nextInt(),
        r = nextInt();
    int[][] z = new int[p][2];
    int[][] x = new int[q][2];
    for (int i = 0; i < p; i++)
      z[i] = new int[]{nextInt(), nextInt()};
    for (int i = 0; i < q; i++)
      x[i] = new int[]{nextInt(), nextInt()};
    int[] times = new int[r + 10];
    Arrays.fill(times, 0);

    int ans = 0;
    for (int i = 0; i < q; i++) {
      int c = x[i][0], d = x[i][1];
      for (int j = 0; j < p; j++) {
        int a = z[j][0], b = z[j][1];
        if (a - d > r || b - c < l) continue;
        for (int k = Math.max(a-d, l); k <= Math.min(b-c, r); k++) {
          if(times[k] == 0) {
            ans++; times[k] = 1;
          }
        }
      }
    }
    writer.println(ans);
  }
  // 239 - 87

  public static void main(String[] args) {
    new CF469_D2_B().run();
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