

import java.io.*;
import java.util.*;

public class Task012 {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt();
    ArrayList<Integer> mathematicians = new ArrayList<>();
    ArrayList<Integer> programmers = new ArrayList<>();
    ArrayList<Integer> physicists = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int student = nextInt();
      if (student == 1) programmers.add(i + 1);
      else if (student == 2) mathematicians.add(i + 1);
      else physicists.add(i + 1);
    }
    int i = 0, j = 0, k = 0;
    ArrayList<Integer[]> teams = new ArrayList<>();
    while(i < programmers.size() && j < mathematicians.size() && k < physicists.size()) {
      teams.add(new Integer[]{
        programmers.get(i),
        mathematicians.get(j),
        physicists.get(k)
      });
      i++; j++; k++;
    }
    writer.println(teams.size());
    for (Integer[] team : teams) {
      for (int jj = 0; jj < team.length; jj++) {
        writer.print(team[jj]);
        if (jj < team.length - 1)
          writer.print(" ");
      }
      writer.println();
    }
  }

  private void inspect(Integer[] values) {
    for (Integer value : values)
      writer.print(value + ", ");
  }

  public static void main(String[] args) {
    new Task012().run();
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