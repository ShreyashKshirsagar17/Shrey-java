package practice1;
import java.util.*;

public class DataHiding {
	
	private double length;
	private double breadth;
	
	public void  setlength()
	{
//		if(l>0)
//		    length=l;
//		else
//			length=0;
		System.out.println("Enter length:");
		Scanner sc=new Scanner(System.in);
		length =sc.nextDouble();
	}
	
	public void setbreadth(double b)
	{
		if(b>0)
		 breadth=b;
		else
			breadth=0;
	}
	
	public double getlength()
	{
		
		return length;
	}
	
	public double getbreadth()
	{
		return breadth;
	}
	
	public double Area()
	{
		return getlength()*getbreadth();
	}
	public double Primeter()
	{
		return 2*(getlength()+getbreadth());
	}

	public static void main(String[] args) {
		
		DataHiding dh=new DataHiding();
		dh.setlength();
		dh.setbreadth(11);
		System.out.println(dh.getlength());
		System.out.println(dh.getbreadth());
		System.out.println(dh.Area());
		System.out.println(dh.Primeter());
		

	}

}
