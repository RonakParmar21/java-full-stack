/*
6. Second Largest Element
Find the second largest number in an array without sorting it.
Example: arr = [5, 3, 8, 6, 9] → Second Largest = 6
*/

public class HW06SecondLargestElementOfArray {
	public static void main(String[] arg) {
		int[] arr = {5, 3, 8, 6, 9};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num != largest && num > secondLargest) {
				secondLargest = num;
			}
		}

		System.out.println("second largest : " + secondLargest);
	}	
}