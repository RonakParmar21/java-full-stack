import java.util.*;

public class HW03CountryCapital {
	public static String getCapital(String country) {
		String capital = "";

		switch(country) {
		case "india":
			capital = "New Delhi";
			break;
		case "us" :
			capital = "Washington, D.C.";
			break;

			case "uk":
				capital = "London";
				break;
			case "canada":
				capital = "Ottawa";
				break;
			default:
				capital = "Not Found";
				break;
		} 

		return capital;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter country : ");
		String country = sc.next();

		System.out.println("Capital of " + country + " is : " + HW03CountryCapital.getCapital(country));
	}
}