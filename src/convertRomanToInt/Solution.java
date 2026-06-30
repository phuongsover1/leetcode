//package convertRomanToInt;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Solution {
//  public static void main(String[] args) {
//    System.out.println(romanToInt("LVIII"));
//  }
//
////1000 + -100 + 1000 -10 + 100 -1 + 4 = 1992
////  -100 + 1000
//  public static int romanToInt(String s) {
//    Map<Character, Integer> mapAll = new HashMap<>();
//    mapAll.put('M', 1000);
//    mapAll.put('D', 500);
//    mapAll.put('C', 100);
//    mapAll.put('L', 50);
//    mapAll.put('X', 10);
//    mapAll.put('V', 5);
//    mapAll.put('I', 1);
//
//
//  }
//
//  // public static int romanToInt(String s) {
//  //// Map<Integer, Integer> occurMap = new HashMap<>();
//  //// occurMap.put(1000, 0);
//  //// occurMap.put(500, 0);
//  //// occurMap.put(100, 0);
//  //// occurMap.put(50, 0);
//  //// occurMap.put(10, 0);
//  //// occurMap.put(5, 0);
//  //// occurMap.put(1, 0);
//  //// occurMap.put(900, 0);
//  //// occurMap.put(400, 0);
//  //// occurMap.put(90, 0);
//  //// occurMap.put(40, 0);
//  //// occurMap.put(9, 0);
//  //// occurMap.put(4, 0);
//  //
//  // Map<String, Integer> mapAll = new HashMap<>();
//  // mapAll.put("M", 1000);
//  // mapAll.put("D", 500);
//  // mapAll.put("C", 100);
//  // mapAll.put("L", 50);
//  // mapAll.put("X", 10);
//  // mapAll.put("V", 5);
//  // mapAll.put("I", 1);
//  // mapAll.put("CM", 900);
//  // mapAll.put("CD", 400);
//  // mapAll.put("XC", 90);
//  // mapAll.put("XL", 40);
//  // mapAll.put("IX", 9);
//  // mapAll.put("IV", 4);
//  //
//  // Set<String> specialRomanSet = new HashSet<>();
//  // specialRomanSet.add("C");
//  // specialRomanSet.add("X");
//  // specialRomanSet.add("I");
//  //
//  // int sum = 0;
//  // for (int i = 0; i < s.length(); i++) {
//  // String checkChars = String.valueOf(s.charAt(i));
//  // if (specialRomanSet.contains(checkChars) && i + 1 < s.length()) {
//  // checkChars = checkChars.concat(String.valueOf(s.charAt(i + 1)));
//  // if (mapAll.containsKey(checkChars)) {
//  // int keyValue = mapAll.get(checkChars);
//  // // occurMap.put(keyValue, occurMap.get(keyValue) + 1);
//  // sum += keyValue;
//  // i++;
//  // continue;
//  // }
//  // // return to the current char at index i
//  // checkChars = String.valueOf(s.charAt(i));
//  // }
//  // // not in special roman or i+1 >= s.length or is special roman but after
//  // concat
//  // // -> do not exist in mapAll
//  // int keyValue = mapAll.get(checkChars);
//  //// occurMap.put(keyValue, occurMap.get(keyValue) + 1);
//  // sum += keyValue;
//  // }
//  //// for (var entry : occurMap.entrySet()) {
//  //// sum = sum + entry.getKey() * entry.getValue();
//  //// }
//  // return sum;
//  // }
//}
