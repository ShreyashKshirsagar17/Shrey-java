package practice1;

public class ABSTRACT1 {
	public static void main(String []args)
	{
		rectangle re=new rectangle();
		re.breadth=10;
		re.length=5;
		System.out.println(re.area());
		System.out.println(re.perimeter());
		
		circle c=new circle();
		c.radius=8;
		System.out.println(c.area());
		c.display();
		System.out.println(c.perimeter());
		
	}

}
