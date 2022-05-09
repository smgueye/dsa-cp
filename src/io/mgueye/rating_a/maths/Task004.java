

import java.io.*;
import java.util.*;

public class Task004 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int Y = nextInt();
    int W = nextInt();
    int allPossibilitiesLeft = 6 - Math.max(Y, W) + 1;
    if (allPossibilitiesLeft == 0) {
      writer.println("0/1");
      return;
    }

    if (allPossibilitiesLeft == 6) {
      writer.println("1/1");
      return;
    }

    int numerator = allPossibilitiesLeft;
    int dominator = 6;
    int gcd = getGcd(dominator, numerator);
    writer.println((numerator / gcd) + "/" + (dominator / gcd));
  }

  private int getGcd(int a, int b) {
    while (b!= 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  public static void main(String[] args) {
    new Task004().run();
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