/*
4. Reverse an Array
Print the array elements in reverse order using a loop.
Example: arr = [1, 2, 3, 4] → Output = 4 3 2 1
*/

public class HW04ReverseArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};

		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
	}	
}