package practice1;

public class Overloading {
	
	static int max (int x,int y)
	{
		if (x>y)
			return x;
		else
			return y;
	}

	static float max (float x,float y)
	{
		if (x>y)
			return x;
		else
			return y;
	}
	
	public static void main(String[] args) {
		
		System.out.println(max(10,20));
		

	}

}
