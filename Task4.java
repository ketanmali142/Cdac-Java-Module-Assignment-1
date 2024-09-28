
//Assignment 4: Voting Eligibility
//Write a program that checks if a person is eligible to vote. A person can vote if they are a citizen and their age is 18 or above.
//Requirements:
//•    Use logical && to combine conditions, and ! to negate conditions if necessary.



package JavaAssignment;

import java.util.*;

public class Task4 {
	private String name;
	private int age;
	private boolean citizen;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("ENter the name of the voter");
		name = sc.next();
		System.out.println("Enter age of the citizen::" + age);
		age = sc.nextInt();
		System.out.println("Enter weather the voter is citizen or not (enter values in true or false)  ");
		citizen = sc.nextBoolean();
	}

	public void checkAge() {
		if (age >= 18 && citizen)
			System.out.println(name + "The is eligible to vote");
		else
			System.out.println(name + "The is not eligible to vote");
	}
}