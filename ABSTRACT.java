package practice1;

abstract class ABSTRACT {
	
	abstract public double area();
	abstract public double perimeter();
}

class rectangle extends ABSTRACT
{
	double length;
	double breadth;
	
	public double area()
	{
		return length*breadth;
	}
	
	public double perimeter()
	{
		return 2*(length*breadth);
	}
}

class circle extends ABSTRACT
{
	double radius ;
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public void display()
	{
		System.out.println("this is from circle ");
	}
}

	
	
