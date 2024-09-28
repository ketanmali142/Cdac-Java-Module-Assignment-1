//Assignment 3: Door Access Control
//Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
//Requirements:
//•    Use logical operators &&, ||, and !.


package JavaAssignment;

import java.util.Scanner;

public class Task3 {

    private boolean hasValidID;
    private boolean hasValidAccessCard;
    private boolean isAdmin;

    Scanner sc = new Scanner(System.in);

    public void inputAccessDetails() {
        System.out.println("Do you have a valid ID? (true/false): ");
        hasValidID = sc.nextBoolean();
        
        System.out.println("Do you have a valid access card? (true/false): ");
        hasValidAccessCard = sc.nextBoolean();
        
        System.out.println("Are you an admin? (true/false): ");
        isAdmin = sc.nextBoolean();
    }

    public void checkAccess() {
        
        if (hasValidID && hasValidAccessCard || isAdmin) {
            System.out.println("Access Granted.");
        } else {
            System.out.println("Access Denied.");
        }
    }
}

   





























