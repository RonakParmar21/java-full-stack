public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		MethodDemo m1 = new MethodDemo();
		m1.greet(); // It is called method calling...

		MethodDemo m2 = new MethodDemo();
		m2.greet();

		// Type 2 :- Method Calling...
		m1.displayName("Ronak", "m1", 21);
		m2.displayName("Parmar", "m2", 22);

		// Type 3 :- Method Calling...
		System.out.println(m1.otpGen());

		// Type 4 :- Method Calling...
		int sum = m1.sum(10, 20);
		System.out.println("Sum is : " + sum);
	}

	// Type 1 :- No Parameter, No Return.
	public void greet() {
		System.out.println("Good Morning!");
	}

	// Type 2 :- With Parameter, No Return.
	public void displayName(String name, String method, int age) {
		System.out.println("Hello " + name + " - " + method + " - " + age);
	}

	// Type 3 :- No Parameter, Returns
	public String otpGen() {
		return "123456";
	}

	// Type 4 :- With Parameter, Return
	public int sum(int a, int b) {
		return a + b;
	}
}