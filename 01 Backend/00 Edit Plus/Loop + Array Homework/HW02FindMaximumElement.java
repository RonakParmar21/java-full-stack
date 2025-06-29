/*
2. Find Maximum Element
Write a program to find the largest number in an array using a loop.
Example: arr = [7, 2, 9, 4] → Max = 9
*/

public class HW02FindMaximumElement {

	public static void main(String[] args) {
		int arr[] = {7, 2, 9, 4, 100};
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum Element is : " + max);
	}
	
}