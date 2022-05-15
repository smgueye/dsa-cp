package io.mgueye.euler_project;

public class EvenFibonacciNumbers {
  public static void main(String[] args) {
    long size = (long) 4e6;
    long a = 1, b = 1, c = 0, sum = 0;
    while (c <= size) {
      c = a + b;
      a = b; b = c;
      if (c % 2 == 0) {
        sum += c;
      }
    }
    System.out.println(sum);
  }
}
