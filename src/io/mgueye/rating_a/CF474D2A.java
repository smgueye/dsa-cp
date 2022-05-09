

import java.io.*;
import java.util.*;

public class CF474D2A {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    ArrayList<Character> keyboard = new ArrayList<>();
    String keyboardAlphabets = "qwertyuiopasdfghjkl;zxcvbnm,./";
    for (int i = 0; i < keyboardAlphabets.length(); i++)
      keyboard.add(keyboardAlphabets.charAt(i));

    String direction = nextToken();
    String text = reader.readLine();
    for (int i = 0; i < text.length(); i++) {
      int index = keyboard.indexOf(text.charAt(i));
      if (Objects.equals(direction, "R"))
        writer.print(keyboard.get(index - 1));
      else
        writer.print(keyboard.get(index + 1));
    }
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new CF474D2A().run();
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
