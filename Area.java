package practice1;
import java.util.*;

public class Area {
	
	
	static int ghan(int x,int y)
	{
		return x*y;
	}
	static double ghan(double r)
	{
		
		return Math.PI*r*r;
	}
	
	static int ghan(int x,int y,int z)
	{
		return 1/2*(x+y)*z;
	}
public static void main(String []args)
{
	System.out.println(ghan(10,20));
	System.out.println(ghan(9.8));	
}
}
