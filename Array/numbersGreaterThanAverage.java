package Array_Questions;

import java.util.Scanner;

public class numbersGreaterThanAverage {
	public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    int[]array = new int[i];
    System.out.println("Enter the numbers of your choice!!");
    for(int j=0;j<i;j++) {
        array[j]= sc.nextInt();	
    }
    System.out.print("The average of the mentioned numbers are");
    int j;
    int m = 0;
    for(j=0;j<i;j++) {
    	m= m+array[j];
    }
    int k= m/i;
    System.out.println(+k);
    for(j=0;j<i;j++) {
    	if(k < array[j]) {
    		k = array[j];
    	   }
    }
    System.out.println("Number greater than the average is "+k);
    
	}
}
