//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    System.out.println(isPalindrome(10101));
  }


  public static boolean isPalindrome(int x) {
    if (x < 0)
      return false;
    if (x < 10)
      return true;
    int reverseNum = 0;
    int devidedX = x;

    while (devidedX >= 10) {
      reverseNum = reverseNum * 10 + devidedX % 10;
      devidedX /= 10;
    }
    reverseNum = reverseNum * 10 +  devidedX;

    if (reverseNum == x) {
      return true;
    }
    return false;
  }
}