import java.util.Scanner;
public class CheckOddEvenTest_1 {
 
	public static void main(String[] args) {
		Scanner scanner = null;
		int number;
		
		try {
			scanner = new Scanner(System.in);
                        System.out.print("Enter number:");
			number = scanner.nextInt();
			if(number%2 ==0)
				System.out.println(number +" is an even number");
			else
				System.out.println(number +" is an odd number");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
output:
Enter number:56
is an even number