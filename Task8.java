//Assignment 8: Determine the Greatest Number Using Ternary Operator
//
//Write a Java program to find the greatest number among three numbers using the ternary operator.
//
//*Input: Three integer numbers from the user.
//*Output: The greatest number among the three entered numbers.


package JavaAssignment;
import java.util.*;

public class Task8 {
		private int num1;
		private int num2;
		private int num3;
		private int result;
		
		Scanner sc=new Scanner(System.in);
		
		public void setNumbers() {
			System.out.println("Enter the numbers: ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
		}
		
		public void gretestNumber() {
			result=(num1>num2)? (num1>num3? num1:num3):(num2>num3? num2:num3);
			System.out.println("Gretest number is: "+result);
		}
	
		

	}

