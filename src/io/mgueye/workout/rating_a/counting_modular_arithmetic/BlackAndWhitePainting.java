

import java.io.*;
import java.util.*;

public class BlackAndWhitePainting {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    while (true) {
      int M = nextInt();
      int N = nextInt();
      int c = nextInt();
      if (M == 0 || N == 0) break;
      if (M == 8 && N == 8 && c == 1) {
        writer.println(1);
        continue;
      }
      int ans = ((M - 8 + 1) * (N - 8 + 1)) / 2;
      if (M % 2 == 0 && N % 2 == 0 && c == 1)
        ans++;
      writer.println(ans);
    }
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new BlackAndWhitePainting().run();
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
