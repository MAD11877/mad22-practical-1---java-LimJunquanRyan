import java.util.ArrayList;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int modeNum = 0;
    int mode = 0;
    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      array.add(in.nextInt());
    }
    for (int i = 0; i < num; i++) {
      int count = 0;
      for (int n = 0; n < num; n++) {
        if (array.get(i).equals(array.get(n))) {
          count++;
        }
      }
      if (count > mode){
        mode = count;
        modeNum = array.get(i);
      }
    }
    System.out.println(modeNum);
  }
}
