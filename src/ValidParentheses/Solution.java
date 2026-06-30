package ValidParentheses;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Solution {
  public static void main(String[] args) {
    System.out.println(isValid("([)]"));
  }
  /*
  Constraints:
    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.

  * "()[]{}" -> true
  * "([)]" -> false
  * can 1 queue -> xet tai index i -> neu ma i = ), ], } -> pop queue -> co bang ngoac tuong ung (, [, { ?? hoac neu queue ma rong  thi return false
  * */
  public static boolean isValid(String s) {
    Stack<Character> parenStack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case '(':
        case '{':
        case '[':
          parenStack.push(s.charAt(i));
          break;
        case ')':
        case '}':
        case ']':
          if (parenStack.isEmpty())
            return false;
          if (s.charAt(i) != checkParen(parenStack.pop()))
            return false;
      }
    }
    if (!parenStack.isEmpty())
      return false;
    return true;
  }

  private static Character checkParen(char paren) {
    switch (paren) {
      case '(':
        return ')';
      case '[':
        return ']';
      case '{':
        return '}';
      default:
        return Character.MIN_VALUE;
    }
  }
}
