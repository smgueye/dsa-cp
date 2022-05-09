

import java.io.*;
import java.util.*;

public class Task011 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    String operations = reader.readLine();
    StringBuilder o = new StringBuilder();
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < operations.length(); i++) {
      if (operations.charAt(i) == '+')
        continue;
      o.append(operations.charAt(i));
    }
    char[] chars = o.toString().toCharArray();
    Arrays.sort(chars);
    for (int i = 0; i < chars.length; i++) {
      ans.append(chars[i]);
      if (i < chars.length - 1)
        ans.append("+");
    }
    writer.println(ans);
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task011().run();
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