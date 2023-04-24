package Arrays_Sheet;

import java.util.Arrays;

public class ChocolateDistribution {
	static int MinDiff(int arr[], int n, int m){
		if(m==0&&n==0) {
			return 0;
			}
		Arrays.sort(arr);
		if(m>n)
			return -1;
		Integer min = Integer.MAX_VALUE;
		for(int i=0; i+m-1<n; i++) {
			int diff =arr[i+m-1]-arr[i];
			if(diff<min)
				min=diff;
			}
		return min;
		}
	public static void main(String[] args) {
		int[] array =  {23,34,234,90,2,35,5,3,6,7,8,3,53,65};
		int n = array.length;
		int m = 6;
		System.out.println("Minimum difference is " +MinDiff(array,n,m));
	}
}


