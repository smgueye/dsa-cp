package io.mgueye.topics.number_theory;

import java.util.HashMap;

public class NumberRepresentationMapping {

  static HashMap<String, String[]> binaryMapping = new HashMap<>(){{
    put("0", new String[]{"0", "0", "0"});
    put("00", new String[]{"0", "0", "0"});
    put("000", new String[]{"0", "0", "0"});
    put("0000", new String[]{"0", "0", "0"});
    put("1", new String[]{"1", "1", "1"});
    put("01", new String[]{"1", "1", "1"});
    put("001", new String[]{"1", "1", "1"});
    put("0001", new String[]{"1", "1", "1"});
    put("10", new String[]{"2", "2", "2"});
    put("010", new String[]{"2", "2", "2"});
    put("0010", new String[]{"2", "2", "2"});
    put("11", new String[]{"3", "3", "3"});
    put("011", new String[]{"3", "3", "3"});
    put("0011", new String[]{"3", "3", "3"});
    put("100", new String[]{"4", "4", "4"});
    put("0100", new String[]{"4", "4", "4"});
    put("101", new String[]{"5", "5", "5"});
    put("0101", new String[]{"5", "5", "5"});
    put("110", new String[]{"6", "6", "6"});
    put("0110", new String[]{"6", "6", "6"});
    put("111", new String[]{"7", "7", "7"});
    put("0111", new String[]{"7", "7", "7"});
    put("1000", new String[]{"8", "8", "10"});
    put("1001", new String[]{"9", "9", "11"});
    put("1010", new String[]{"10", "A", "12"});
    put("1011", new String[]{"11", "B", "13"});
    put("1100", new String[]{"12", "C", "14"});
    put("1101", new String[]{"13", "D", "15"});
    put("1110", new String[]{"14", "E", "16"});
    put("1111", new String[]{"15", "F", "17"});
  }};

  static HashMap<String, String[]> octalToBinaryMapping = new HashMap<>(){{
    put("0", new String[]{"0", "000"});
    put("1", new String[]{"1", "001"});
    put("2", new String[]{"2", "010"});
    put("3", new String[]{"3", "011"});
    put("4", new String[]{"4", "100"});
    put("5", new String[]{"5", "101"});
    put("6", new String[]{"6", "110"});
    put("7", new String[]{"7", "111"});
    put("10", new String[]{"8", "1000"});
    put("11", new String[]{"9", "1001"});
    put("12", new String[]{"10", "1010"});
    put("13", new String[]{"11", "1011"});
    put("14", new String[]{"12", "1100"});
    put("15", new String[]{"13", "1101"});
    put("16", new String[]{"14", "1110"});
    put("17", new String[]{"15", "1111"});
  }};

  static HashMap<String, String[]> hexadecimalToBinaryMapping = new HashMap<>(){{
    put("0", new String[]{"0", "0000"});
    put("1", new String[]{"1", "0001"});
    put("2", new String[]{"2", "0010"});
    put("3", new String[]{"3", "0011"});
    put("4", new String[]{"4", "0100"});
    put("5", new String[]{"5", "0101"});
    put("6", new String[]{"6", "0110"});
    put("7", new String[]{"7", "0111"});
    put("8", new String[]{"8", "1000"});
    put("9", new String[]{"9", "1001"});
    put("A", new String[]{"10", "1010"});
    put("B", new String[]{"11", "1011"});
    put("C", new String[]{"12", "1100"});
    put("D", new String[]{"13", "1101"});
    put("E", new String[]{"14", "1110"});
    put("F", new String[]{"15", "1111"});
  }};

  public static String toBinary(String binary, NumberBase baseDst) {
    return octalToBinaryMapping.get(binary)[1];
  }
}
