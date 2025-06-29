/*
1. Sum of Elements
Write a program to find the sum of all elements in an integer array.
Example: arr = [1, 2, 3, 4, 5] → Sum = 15
*/

public class HW01SumOfAllElementOfArray {
	public static void main(String[] arg) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int i=0;i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of arr is : " + sum);
	}
}