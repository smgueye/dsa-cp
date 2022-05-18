package io.mgueye.workout.rating_b.w001;

import java.io.*;
import java.util.*;

public class CF47_D2_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    HashMap<Character, Integer> weights = new HashMap<>(){{put('A', 0); put('B', 0); put('C', 0);}};
    String instruction;
    int N = 3;

    while (N > 0) {
      instruction = reader.readLine();
      char x = instruction.charAt(0), op = instruction.charAt(1), y = instruction.charAt(2);
      if (op == '>') {
        weights.put(x, weights.get(x) + 1);
      } else {
        weights.put(y, weights.get(y) + 1);
      }
      N--;
    }

    if(Objects.equals(weights.get('A'), weights.get('B'))
        || Objects.equals(weights.get('B'), weights.get('C'))
        || Objects.equals(weights.get('A'), weights.get('C'))) {
      writer.println("Impossible");
      return;
    }

    int C = 0;
    while (C < 3) {
      for (Map.Entry<Character, Integer> e : weights.entrySet())
        // writer.println("(" + e.getKey() + "," + e.getValue() + ")");
        if(e.getValue() == C)
          writer.print(e.getKey());
      C++;
    }
    writer.println();
  }

  public static void main(String[] args) {
    new CF47_D2_B().run();
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