package practice1;

public class Inheritance {
	public int a=10;
	protected int b=5;
	
	public boolean compare()
	{
		if(a>b)
			return true;
		else
			return false;
	}

}
class Demo extends Inheritance{
	
	protected int c;
	
	public int square(int l)
	{
		c=l;
		return c*c;
	}
	
}

