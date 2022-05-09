package io.mgueye.rating_a.warmup;

import java.io.*;
import java.util.*;

public class Task010 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int N = nextInt();
    StringBuilder chain = null;
    int blocsNumber = 0;
    while (N > 0){
      if (chain == null) {
        chain = new StringBuilder(reader.readLine());
        N--;
        continue;
      }
      String magnet = reader.readLine();
      if (magnet.charAt(0) == chain.charAt(chain.length() - 1)) {
        blocsNumber++;
      }
      chain.append(magnet);
      N--;
    }
    blocsNumber++;
    writer.println(blocsNumber);
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task010().run();
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
