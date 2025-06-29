import java.util.*;

public class HW02TriangleArea {
	public static void calculateAreaOfTriangle(double base, double height) {
		double areaOfTringle = 1.0/2.0 * base * height;
		System.out.println("Area of Triangle is : " + areaOfTringle);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base Value : ");
		double base = sc.nextDouble();;

		System.out.println("Enter Height Value : ");
		double height = sc.nextDouble();

		HW02TriangleArea.calculateAreaOfTriangle(base, height);
	}
}