import java.util.*;

public class HW01Count {
	public static int getCount(int a, int b) {
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println("Enter a number : ");
		int b = sc.nextInt();

		System.out.println("Sum from " + a + " to " + b + " is : " + HW01Count.getCount(a, b));
	}
}