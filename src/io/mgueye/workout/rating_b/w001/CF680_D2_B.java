package io.mgueye.workout.rating_b.w001;

import java.io.*;
import java.util.*;

public class CF680_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    // long startTime = System.nanoTime();
    int n = nextInt(), pos = nextInt() - 1, dst = 0, nbCriminals = 0;
    int[] t = new int[n];
    for (int i = 0; i < n; i++)
      t[i] = nextInt();
    while (pos + dst < n || pos - dst >= 0) {
      if (pos + dst >= n && pos - dst >= 0) {
        if(t[pos - dst] == 1) {
          nbCriminals++;
        }
        dst++;
        continue;
      }

      if(pos - dst < 0 && pos + dst < n) {
        if(t[pos + dst] == 1) {
          nbCriminals++;
        }
        dst++;
        continue;
      }

      if(t[pos + dst] == 1 && t[pos - dst] == 1){
        if (dst == 0) nbCriminals++;
        else nbCriminals += 2;
      }
      dst++;
    }
    writer.println(nbCriminals);
    // long endTime   = System.nanoTime();
    // long totalTime = endTime - startTime;
    // writer.println("time: " + totalTime + "ns");
  }

  public static void main(String[] args) {
    new CF680_D2_B().run();
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