
import java.io.*;
import java.util.*;

public class Task010 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    long x = nextInt();
    long kidsInDistress   = 0;
    for (int i = 0; i < n; i++) {
      String action = nextToken();
      int amount = nextInt();
      if (Objects.equals(action, "+")) {
        x += amount;
      } else {
        if (amount <= x) {
          x -= amount;
        } else {
          kidsInDistress++;
        }
      }
    }
    writer.println(x + " " + kidsInDistress);
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
