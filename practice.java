package practice1;

public class practice {
	
	static int x=10;
	public int y=50;
	
	public static void demo()
	{
		System.out.println("this is from static ");
	}
	
	void display()
	{
		System.out.println("this is non static :");
	}

	public static void main(String[] args) {
		
//		practice.demo();
		
		practice p =new practice();
		practice p1=new practice();
		p.x=100;
		p.y=500; 
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p1.x);
		System.out.println(p1.y);
//		p.display();
//		p.demo();
	

	}

}
