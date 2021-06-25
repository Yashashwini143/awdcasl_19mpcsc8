import java.util.Scanner;
public class Bitwise
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please enter a number: ");
      int number = sc.nextInt();
      if((number & 1) == 0)
      {
         System.out.println(number + " is an even number.");
      }
      else
      {
         System.out.println(number + " is an odd number.");
      }
      sc.close();
   }
}