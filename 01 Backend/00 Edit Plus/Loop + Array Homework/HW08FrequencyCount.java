/*
8. Frequency Count
Count the frequency of each element in the array using a loop.
Example: arr = [1, 2, 1, 3, 2, 1] → 1:3, 2:2, 3:1
*/

public class HW08FrequencyCount {
	public static void main(String[] arg) {
		int[] arr = {1, 2, 1, 3, 2, 1};
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[z]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + ": " + count);
        }
	}
}