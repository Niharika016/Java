package exercise;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the year you want to test: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("you entered " +a);
		if(a%4==0 && a%100 != 0) {
			System.out.println("leap");
		}
		else if((a%4==0 && a%400 ==0)&& a%400 ==0) {
			System.out.println("leap");
		}
		else {
			System.out.println("oops! Not leap.");
		}

	}

}
