package io.mgueye;

import io.mgueye.topics.number_theory.Decimal;
import io.mgueye.topics.number_theory.Number;
import io.mgueye.topics.number_theory.NumberBase;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Number number = new Number();
    number.inspect(new Decimal(11).toBase(2), "");
  }
}
