package practice1;

public class ParaConstructor {
	
	public int  length;
	public int breadth;
	
	ParaConstructor ()
	{
		length=breadth=1;
	}
	ParaConstructor(int l,int b)
	{
		length=l;
		breadth=b;
		System.out.println("from parent");
	}

}

class Constructor1 extends ParaConstructor
{
	public int height;
	Constructor1()
	{
		height=1;
		System.out.println("from child");
	}
	Constructor1(int x,int y)
	{
		super(x,y);
		
		System.out.println("from child ");
	}
	int vloum()
	{
		return length*breadth;
	}
	
}

