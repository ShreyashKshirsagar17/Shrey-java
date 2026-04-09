package practice1;
import java.util.*;

public class Rectangle {
	
	public double l;
	public double b;
	
	public double Area()
	{
		return l*b;
	}
	public double perimeter()
	{
		return 2*(l+b);
	}
	public boolean isSquare()
	{
		if(l==b)
		  return true;
		else
			return false;
	}
	

	public static void main(String[] args) {
		
		Rectangle R1=new Rectangle();
		Scanner sc=new Scanner(System.in);
		
		
		R1.l=99;
		R1.b=99;
		System.out.println(R1.Area());
		System.out.println(R1.perimeter());
		System.out.println(R1.isSquare());

	}

}
