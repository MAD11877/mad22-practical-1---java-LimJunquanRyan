import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your height in m: ");
    double height = in.nextDouble();
    System.out.print("Enter your weight in kg: ");
    double weight = in.nextDouble();
    System.out.println("Your BMI is " + weight / (height * height));
  }
}
