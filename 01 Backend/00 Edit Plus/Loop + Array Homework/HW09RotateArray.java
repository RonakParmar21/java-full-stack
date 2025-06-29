/*
9. Rotate Array Left by 1
Rotate the array to the left by 1 position using a loop.
Example: arr = [10, 20, 30, 40] → Output = [20, 30, 40, 10]
*/

public class HW09RotateArray {
	public static void main(String[] arg) {
		int[] arr = {10, 20, 30, 40};
        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
}