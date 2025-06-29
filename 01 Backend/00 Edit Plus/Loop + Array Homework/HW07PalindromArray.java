/* 
7. Check for Palindrome Array
Check if the array is a palindrome (reads same from start and end).
Example: arr = [1, 2, 3, 2, 1] → Yes
*/

public class HW07PalindromArray {
	public static void main(String[] arg) {
		int[] arr = {1, 2, 3, 2, 1};

        if (isPalindrome(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}

	public static boolean isPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}