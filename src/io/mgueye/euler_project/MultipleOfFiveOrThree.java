package io.mgueye.euler_project;

public class MultipleOfFiveOrThree {
  public static void main(String[] args) {
    long sum = 3 + 5;
    for (int i = 6; i < 1000; i++) {
      if(i % 3 == 0 || i % 5 == 0) sum += i;
    }
    System.out.println(sum);
  }
}
