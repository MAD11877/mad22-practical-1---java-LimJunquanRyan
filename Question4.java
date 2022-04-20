import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter base of right-angled triangle: ");
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
