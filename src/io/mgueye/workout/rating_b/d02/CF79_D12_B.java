package io.mgueye.workout.rating_b.d02;

import java.io.*;
import java.util.*;

public class CF79_D12_B {

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter writer;

  private void solve() throws IOException {
    int n = nextInt(),
        m = nextInt(),
        k = nextInt(),
        t = nextInt();
    Map<Integer, String> crops = new HashMap<>(){{
      put(-1, "Waste");
      put(0, "Carrots");
      put(1, "Kiwis");
      put(2, "Grapes");
    }};

    List<Integer[]> wastelands = new ArrayList<>();
    for (int i = 0; i < k; i++) {
      int row = nextInt() - 1,
          col = nextInt() - 1;
      wastelands.add(new Integer[]{row, col});
    }

    for (int i = 0; i < t; i++) {
      int row = nextInt() - 1;
      int col = nextInt() - 1;

      int nbWastedLand = 0;
      boolean flag = false;
      for (Integer[] land: wastelands) {
        if (land[0] == row && land[1] == col) {
          writer.println(crops.get(-1));
          flag = true;
          break;
        }
        if (land[0] < row || (land[0] == row && land[1] <= col)) nbWastedLand++;
      }
      if (flag) continue;
      int I = (row * m) + col;
      int J = nbWastedLand;
      writer.println(crops.get((I - J) % 3));
    }
  }

  public static void main(String[] args) {
    new CF79_D12_B().run();
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