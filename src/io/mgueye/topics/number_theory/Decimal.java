package io.mgueye.topics.number_theory;

import java.util.ArrayList;
import java.util.HashMap;

public class Decimal {
  long value;

  HashMap<Integer, String> mapIntegers = new HashMap<>(){{
    put(10, "A");
    put(11, "B");
    put(12, "C");
    put(13, "D");
    put(14, "E");
    put(15, "F");
  }};

  public Decimal(long value) {
    this.value = value;
  }

  public ArrayList<String> toBase(int base) {
    ArrayList<String> digits = new ArrayList<>();
    long x = value;
    while (x != 0) {
      Integer digit = (int) (x % base);
      if(mapIntegers.containsKey(digit))
        digits.add(0, mapIntegers.get(digit));
      else
        digits.add(0, digit.toString());
      x /= base;
    }
    return digits;
  }

  public long fastModularExponentiation(int b, ArrayList<Integer> n, int m) {
    long x = 1, power = b % m;
    for (Integer integer : n) {
      if (integer == 1) x *= power;
      power += power;
    }
    return x;
  }
}
