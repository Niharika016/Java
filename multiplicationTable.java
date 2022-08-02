package Array_Questions;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ;
		System.out.println("Write the number of your choice.");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		for(int j=1 ; j<=10; j++) {
			int k = i*j;
			System.out.println(i+"X"+j+" = "+k);
			
		}

	}

}
