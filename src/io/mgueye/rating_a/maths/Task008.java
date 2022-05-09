package io.mgueye.rating_a.maths;


import java.io.*;
import java.util.*;


// READ: 1.5
// THK: 1.5
// CODE: 1.5
// DEBUG: 1.5
public class Task008 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    HashSet<Object> hashSet = new HashSet<>();
    String setAsStr = reader.readLine();
    for (int i = 0; i < setAsStr.length(); i++) {
      char element = setAsStr.charAt(i);
      if (element == '{' || element == ',' || element == '}' || element == ' ')
        continue;
      hashSet.add(element);
    }
    writer.println(hashSet.size());
  }

  public static void main(String[] args) {
    new Task008().run();
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