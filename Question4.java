import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    for (int i = base; i > 0; i--) {
      String str = "";
      for (int n = 0; n < i; n++) {
        str = str.concat("*");
      }
      System.out.println(str);
    }
  }
}
