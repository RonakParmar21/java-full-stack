/*
10. Find Duplicate Elements
Find and print all duplicate elements in an array.
Example: arr = [1, 2, 3, 2,5, 5, 4, 1] → Duplicates: 1, 2, 4, 5
*/

public class HW10FindDuplicateElement {
	public static void main(String[] arg) {
		int[] arr = {1, 2, 3, 5, 2, 4, 1, 5, 4, 5, 6, 5};
        boolean[] visited = new boolean[arr.length];

        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    isDuplicate = true;
                }
            }
            if (isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
	}
}