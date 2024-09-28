//Assignment 7: Weather Conditions
//Write a program that determines whether it's safe to go outside based on temperature and weather conditions. The conditions to go outside are:
//•    Temperature should be between 20°C and 30°C.
//•    It should not be raining.
//Requirements:
//•    Use logical operators && and !.



package JavaAssignment;
import java.util.*;

public class Task7 {

		private int temp;
		private boolean rain;
		
		Scanner sc=new Scanner(System.in);
		
		public void setTemp() {
			System.out.println("Enter the temprature: ");
			temp=sc.nextInt();
			System.out.println("It should be rain(true/false): ");
			rain=sc.nextBoolean();
		}
		public void checkWeatherCondition() {
			if(!(temp<=20 && temp>=30) && rain) {
				System.out.println("it's not safe to go outside ");
			}
			else {
				System.out.println("it's safe to go outside ");
			}
		}

	}

