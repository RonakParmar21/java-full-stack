public class IfElseDemo {
	public static void main(String[] args) {
		int a=4; //
		System.out.println("babu 10rs ha kya ...?");
		if(a>10)
		{
			System.out.println("chal tu khush rah");
			a=a-10;
			System.out.println("babu 9rs or de do...");
			if(a>8)  
			{   
				System.out.println("babu 9 paytm krta hu...");
				a=a-9; //1
			}
			else
			{
				System.out.println("Sorry babu...");
				System.out.println("chal koe bat 5 wali kitkat dila do");
				if(a>5)
				{
					System.out.println("kitkat lelo");
				}
				else
				{
					System.out.println("Koe bat nhi babu main paise de deti hu");
				}

			}
		}
		else if(a>5)
		{
			System.out.println("bhai 10 nhi ha maire pass");
			System.out.println("Chal 5 hi de de");
			if(a>5)
			{
				System.out.println("chal bhai tu 5 lele khush rah");
				
			}
			else{
				System.out.println("bhai 5 nhi ha maire pass");
			}
		}
		else{

				System.out.println("paise hi nhi ha");
		}
	}
}