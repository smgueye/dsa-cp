package io.mgueye.topics.number_theory;

import java.util.ArrayList;
import java.util.Collections;

public class Number {

  public ArrayList<Integer> convertDecimalToBinary(int value) {
    ArrayList<Integer> integers = new ArrayList<>();

    while (value != 0) {
      int digit = value % 2;
      integers.add(0, digit);
      value /= 2;
    }
    return integers;
  }


  public int convertBinaryToDecimal(String digits) {
    double value = 0;
    int pow = 0;
    for (int i = digits.length() - 1; i >= 0; i--) {
      value += (Character.getNumericValue(digits.charAt(i)) * Math.pow(2, pow));
      pow++;
    }
    return (int) value;
  }

  public ArrayList<Integer> convertIntoBinary(ArrayList<Integer> integers, NumberBase srcBase) {
    // TODO: Put the part below in a function.
    ArrayList<Integer> digits = new ArrayList<>();
    ArrayList<String> intermediate = new ArrayList<>();
    for (int i = integers.size() - 1; i >= 0; i--)
      intermediate.add(NumberRepresentationMapping.toBinary(integers.get(i).toString(), srcBase));

    Collections.reverse(intermediate);
    inspect(intermediate, ':');
    for (int i = 0; i < intermediate.size(); i++)
      for (int j = 0; j < intermediate.get(i).length(); j++)
        digits.add(Character.getNumericValue(intermediate.get(i).charAt(j)));

    return digits;
  }

  public ArrayList<Integer> convertBinaryTo(ArrayList<Integer> binary, NumberBase dstBase) {
    int shift = 10;
    if(dstBase == NumberBase.OCTAL)
      shift = 3;
    if(dstBase == NumberBase.HEXADECIMAL)
      shift = 4;

    // TODO: Put the part below in a function.
    ArrayList<Integer> digits = new ArrayList<>();

    int start = binary.size() - 1 - (shift - 1); // repetitive -1 are not unuseful, but just to make it more clear.
    StringBuilder b;
    while (start >= 0) {
      b = new StringBuilder();
      for (int i = start; i < start + shift; i++)
        b.append(binary.get(i));
      digits.add(convertBinaryToDecimal(b.toString()));
      start -= shift;
    }
    b = new StringBuilder();
    int end = start + (shift - 1),
        missingZeros = shift - 1 - end; // 3(shift) - 1 because end represent position of last index not size;
    while (missingZeros > 0) {
      b.append(0);
      missingZeros--;
    }
    for (int i = 0; i <= end; i++)
      b.append(binary.get(i));
    if (b.length() > 0) digits.add(convertBinaryToDecimal(b.toString()));
    Collections.reverse(digits);
    return digits;
  }

  public ArrayList<Integer> convertBinaryToHexadecimal(ArrayList<Integer> binary) {
    return null;
  }

  public ArrayList<Integer> convertOctalToBinary(ArrayList<Integer> digits) {
    for (int i = 0; i < digits.size(); i++) {
    }
    return null;
  }

  public ArrayList<Integer> convertHexadecimalToBinary(ArrayList<Integer> hexadecimal) {
    return null;
  }


  public <T> void inspect(ArrayList<T> digits, char delimiter) {
    for (T digit : digits) System.out.print(digit);
    System.out.println(delimiter);
  }
}
