class StudentMethodDemo
{
	//instance
	String name="RonakParmar";
	int age =24;
	static String course = "Java";

	public static void main(String[] args) 
	{
		/*
		System.out.println("Name "+ name);
		System.out.println("age "+ age);
		*/
		StudentMethodDemo s=new StudentMethodDemo();
		System.out.println("Name "+ s.name);
		System.out.println("age "+ s.age);
		System.out.println("course "+ s.course);

		s.name="Ronak";
		s.course="DSA";
		System.out.println("Name "+ s.name);
		System.out.println("course "+ s.course);


		System.out.println("-----------------------------------------------");
		StudentMethodDemo s1=new StudentMethodDemo();
		System.out.println("Name "+ s1.name);
		System.out.println("age "+ s1.age);
		System.out.println("course "+ s1.course);

		s1.name="Parmar";

		s.display();
		s1.display();
	}

	public void display()
	{
		String name = "Yash";
		System.out.println("Name "+ name);
	}
}
