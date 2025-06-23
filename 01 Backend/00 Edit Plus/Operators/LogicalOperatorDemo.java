public class LogicalOperatorDemo {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		System.out.println("a && b is : " + (a && b));
		System.out.println("a || b is : " + (a || b));
		System.out.println("!(a && b) is : " + !(a && b));
	}
}