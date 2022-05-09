package io.mgueye.rating_a;

import java.io.*;
import java.util.*;

public class CF785_D2_A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt(), total = 0;
    HashMap<String, Integer> polyhedrons = new HashMap<>(){{
      put("Tetrahedron", 4);
      put("Cube", 6);
      put("Octahedron", 8);
      put("Dodecahedron", 12);
      put("Icosahedron", 20);
    }};
    while (n > 0) {
      total += polyhedrons.get(reader.readLine());
      n--;
    }
    writer.println(total);
  }

  public static void main(String[] args) {
    new CF785_D2_A().run();
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