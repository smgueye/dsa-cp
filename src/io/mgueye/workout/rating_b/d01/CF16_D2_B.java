package io.mgueye.workout.rating_b.d01;

import java.io.*;
import java.util.*;

public class CF16_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int BOX_INDEX = 0, MATCHE_INDEX = 1;

    int n = nextInt(), m = nextInt();
    int[][] containers = new int[m][2];
    for (int i = 0; i < m; i++) {
      containers[i][BOX_INDEX] = nextInt();
      containers[i][MATCHE_INDEX] = nextInt();
    }

    Arrays.sort(containers, new Comparator<int[]>() {
      @Override
      public int compare(int[] a, int[] b) {
        return a[MATCHE_INDEX] < b[MATCHE_INDEX] ? 1 : -1;
      }
    });

    int containerIndex = 0, ans = 0;
    while (n > 0 && containerIndex < m) {
      int box = Math.min(n, containers[containerIndex][BOX_INDEX]);
      ans += (box * containers[containerIndex][MATCHE_INDEX]);
      containerIndex++;
      n -= box;
    }
    writer.println(ans);
  }

  public static void main(String[] args) {
    new CF16_D2_B().run();
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