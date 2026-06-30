package longestCommonPrefix;

public class Main {
  public static void main(String[] args) {
    System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
  }

  // ["flower","flow","flight"] -> "fl"
  // result = ""
  // f, f, f  -> i >= n.length() -> result = "f"
  // l, l, l -> i >= n.length() -> result = "fl"
  // o, o, i -> break -> return result
  // phai duyet qua 1 vong kiem len cua chuoi nho nhat nua
  public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 1)
      return strs[0];

    int minLength = strs[0].length();
    for (int i = 1; i < strs.length; i++) {
      if (strs[i].length() < minLength) {
        minLength = strs[i].length();
      }
    }


    StringBuilder result = new StringBuilder();
    for (int j = 0; j < minLength ; j++) {
      char currentChar = strs[0].charAt(j);
      for (int i = 1; i < strs.length; i++) {
        if (currentChar != strs[i].charAt(j)) {
          return result.toString();
        }
      }

      result.append(currentChar);
    }

    return result.toString();
  }
}
