package practice1;

public class Constructor {
	
	private int a;
	private int b;
	
	public Constructor()
	{
		a=10;
		b=20;
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public Constructor(int n,int m)
	{
		a=n;
		b=m;
		System.out.println(a);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		
		Constructor c1 =new Constructor(100,200);

	}

}
