package practice1;

public class Circle {

	public double radious;
	
	public double Area()
	{
		return Math.PI*radious*radious;
	}
	
	public double parameter()
	{
		return 2*Math.PI*radious*radious;
	}
	public double circumference()
	{
		return parameter();
	}
	public static void main(String[] args) {
		
		Circle c1=new Circle();
		c1.radious=17;
		System.out.println(c1.Area());
		System.out.println(c1.parameter());
		System.out.println(c1.circumference());
		
	}

}
