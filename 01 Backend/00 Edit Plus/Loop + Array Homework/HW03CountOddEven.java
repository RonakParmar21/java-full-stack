/*
3. Count Even and Odd
Count how many elements are even and how many are odd in a given array.
Example: arr = [2, 3, 5, 6, 8] → Even = 3, Odd = 2
*/

public class HW03CountOddEven {
	public static void main(String[] arg) {
		int[] arr = {2, 3, 5, 6, 8};
		int odd = 0;
		int even = 0;

		for(int num : arr) {
			if(num % 2 == 0)
				even++;
			else 
				odd++;
		}

		System.out.println("Even = " + even + ", Odd = " + odd);
	}
}