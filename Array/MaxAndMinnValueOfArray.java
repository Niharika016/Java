package Array_Questions;

import java.util.Scanner;

public class MaxAndMinnValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Enter the number of index in the array : ");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		int[]array = new int[i];
		System.out.println("Enter the numbers in the array.");
		//input of numbers 
		for(int j =0; j<i;j++) {
			array[j]= sc.nextInt();
			
		}
		//for printing maximum value :
		int max =Integer.MIN_VALUE;
		for(int m=0;m<i;m++) {
			if(array[m]>max) {
				max = array[m];
			}
		}	
		System.out.println("The maximum value is " +max);
		// for minimum value 
		int min =Integer.MAX_VALUE;
		for(int m=0;m<i;m++) {
			if(array[m]<min) {
				min = array[m];
			}
		}	
		System.out.println("The minimum value is " +min);
		
	}

}
