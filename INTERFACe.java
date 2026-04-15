package practice1;

interface XYZ
{
	final static int X=10;
	public abstract void meth1();
	public abstract void meth2();
	
	default void meth3()
	{
		System.out.println("meth3 in interface XYZ");
	}
}

interface ABC extends XYZ
{
	void meth4();
}
public class INTERFACe implements ABC {

	public void meth1() {
		
	}
	public void meth2()
	{
		
	}
//	public void meth3()
//	{
//		
//	}
	public void meth4()
	{
		
	}
	

}
