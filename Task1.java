//Assignment 1: Validating Age and Income
//Write a program that checks if a person is eligible for a loan based on their age and income.
//Requirements:
//•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
//•    Use logical && to combine these conditions.

package JavaAssignment;

import java.util.*;

public class Task1 {

	private String ename;
	private int age;
	private double income;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Name, Age and Income :");
		ename = sc.next();
		age = sc.nextInt();
		income = sc.nextDouble();
	}

	public void checkAge(){
		if (age > 18 && age < 60 )
		{
			System.out.println("Eligible for loan");
		} else
			System.out.println("Not Eligible for loan");
	}

	public void checkIncome() {
		if (income > 25000 && income < 0) {
			System.out.println("Income is Valid for Applying the Loan");
		}
		else {
			System.out.println("Not valid");
		}
	}

	public void display() {
		System.out.println("employee name is : " + ename);
		System.out.println("age is : " + age);
		System.out.println("Income is : " + income);
	}

}
