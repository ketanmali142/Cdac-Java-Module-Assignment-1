//Assignment 2: Exam Grading System
//Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
//Requirements:
//•    Use logical operators && and || to combine conditions.

package JavaAssignment;

import java.util.*;

public class Task2 {

	private String sname;
	private int s1,s2,s3;
	private int average,total;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Student Name : ");
		sname = sc.next();
		System.out.println("Enter Subject 1 Marks : ");
		s1= sc.nextInt();
		System.out.println("Enter Subject 2 Marks : ");
		s2= sc.nextInt();
		System.out.println("Enter Subject 3 Marks : ");
		s3= sc.nextInt();
		
		total=s1+s2+s3;
		average=total/3;
	}

	public void checkAvg(){
		if (average >= 60 && s1>40 && s2>40 && s3>40 )
		{
			System.out.println("Student is Pass");
		} else
			System.out.println("Student is Fail");
	}


	public void display() {
		System.out.println("Student Name is : " + sname);
		System.out.println("Total of three subjects : " + total);
		System.out.println("Average is : " + average);
	}

}
