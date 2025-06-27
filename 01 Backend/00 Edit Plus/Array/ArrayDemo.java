public class ArrayDemo {
	
	public static void main(String[] args) {
		int[] num = new int[5];
		//num[0] = 10;
		//num[1] = 11;
		//num[2] = 12;
		//num[3] = 13;
		//num[4] = 14;

		//System.out.println(num[2]);

		//========= BEST PRACTICE ===========
		for(int i = 0; i < 5; i++) {
			num[i] = i;
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
	}
}