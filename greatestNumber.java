package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class greatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of index in array:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] numbers = new int[i];
		System.out.println("Enter the mumbers of your choice!!");
		for(int j=0 ; j<i ; j++) {
			numbers[j]= sc.nextInt();
		}
		System.out.println("The entered numbers are" +Arrays.toString(numbers));
		int largestNumber = 0;
		for(int j=0;j<i;j++) {
			if(numbers[j]>largestNumber) {
				largestNumber = numbers[j];
			}
		}
		System.out.println("Greatest nnumber among them is "+largestNumber);
		
	}

}
