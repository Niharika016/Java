package exercise;

import java.util.Scanner;

public class swapTwoNumbers {
	public static void main(String[]args) {
	System.out.println("Enter the numbers of your choice!!");
	Scanner sc= new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	System.out.println("the numbers you wrote are " +x +"," +y);
	x = x+y;
	y = x-y;
	x = x-y;
	System.out.println("after swapping :"+x+","+y);
	}

}
