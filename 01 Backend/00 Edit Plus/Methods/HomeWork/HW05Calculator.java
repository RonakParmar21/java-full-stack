import java.util.*;

public class HW05Calculator {
	public static int getAddition(int num1, int num2) {
		return num1 + num2;
	}

	public static int getSubtraction(int num1, int num2) {
		return num1 - num2;
	}

	public static int getMultiplication(int num1, int num2) {
		return num1 * num2;
	}

	public static int getDivision(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select from 1 to 4 to perform calculation : ");
		System.out.println("1 for addition");
		System.out.println("2 for subtraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for division");
		int number = sc.nextInt();
		int num1 = 0, num2 = 0;
		switch(number) {
			case 1:
				System.out.println("Enter value 1 : ");
				num1 = sc.nextInt();
				System.out.println("Enter value 2 : ");
				num2 = sc.nextInt();
				System.out.println(HW05Calculator.getAddition(num1, num2));
				break;
			case 2:
				System.out.println("Enter value 1 : ");
				num1 = sc.nextInt();
				System.out.println("Enter value 2 : ");
				num2 = sc.nextInt();
				System.out.println(HW05Calculator.getSubtraction(num1, num2));
				break;
			case 3:
				System.out.println("Enter value 1 : ");
				num1 = sc.nextInt();
				System.out.println("Enter value 2 : ");
				num2 = sc.nextInt();
				System.out.println(HW05Calculator.getMultiplication(num1, num2));
				break;
			case 4:
				System.out.println("Enter value 1 : ");
				num1 = sc.nextInt();
				System.out.println("Enter value 2 : ");
				num2 = sc.nextInt();
				System.out.println(HW05Calculator.getDivision(num1, num2));
				break;
			default:
				System.out.println("Invalid Selection.");
				break;
		}
	}
}