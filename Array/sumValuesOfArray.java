package Array_Questions;

import java.util.Scanner;

public class sumValuesOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of index in the array!!");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int [] array = new int[i];
		System.out.println("Write the numbers of your choice in the array: ");
		for(int a =0; a<i; a++) {
		    array[a] = sc.nextInt();
		}
		int m =0;
		for(int j=0; j<i;j++) {
			m = m+array[j];
			
		}
		System.out.println("The sum of the numbers entered in array is : " +m);
		

	}

}
