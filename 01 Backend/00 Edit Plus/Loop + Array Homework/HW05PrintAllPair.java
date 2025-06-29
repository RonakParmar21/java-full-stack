/*
5. Print All Pairs
Print all possible pairs from an array using nested loops.
Example: arr = [1, 2, 3] → (1,2), (1,3), (2,3)
*/

public class HW05PrintAllPair {
	public static void main(String[] arg) {
		int[] arr = {1, 2, 3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr.length;j++) {
				if(arr[i] == arr[j])
					continue;
				System.out.println(arr[i] + " " + arr[j]);
			}
		}
	}	
}