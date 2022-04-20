import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number to be squared: ");
    int square = in.nextInt();
    System.out.println("The square is " + square * square);
  }
}
