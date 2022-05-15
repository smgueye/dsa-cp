package io.mgueye;

import io.mgueye.topics.number_theory.Number;
import io.mgueye.topics.number_theory.NumberBase;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Number number = new Number();
    ArrayList<Integer> octal = new ArrayList<>() {{
      add(1);add(3);add(2);
    }};
    ArrayList<Integer> binary = number.convertIntoBinary(octal, NumberBase.OCTAL);
    ArrayList<Integer> hex = number.convertBinaryTo(binary, NumberBase.HEXADECIMAL);
    System.out.println("OCT");
    number.inspect(octal, "");
    System.out.println("HEX");
    number.inspect(hex, "");
  }
}
