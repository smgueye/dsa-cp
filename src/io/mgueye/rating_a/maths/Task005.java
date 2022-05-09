

import java.io.*;
import java.util.*;

public class Task005 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int N = nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = nextInt();

    int m = nextInt();
    for (int i = 0; i < m; i++) {
      int x = nextInt() - 1;
      int y = nextInt();

      int birdsAtLeft = a[x] - (a[x] - y) - 1;
      int birdsAtRight = a[x] - y;

      a[x] = 0;
      if (x - 1 >= 0)
        a[x - 1] += birdsAtLeft;
      if (x + 1 < N)
        a[x + 1] +=  birdsAtRight;
    }

    for (int j : a) {
      writer.println(j);
    }
  }

  public static void main(String[] args) {
    new Task005().run();
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