package practice1;

public class overriding {
	
	public void display()
	{
		System.out.println("this is from parent ");
		
	}
	
	

}
class child extends overriding
{
	public void display()
	{
		System.out.println("this is from child ");
		
	}
	
	public int show()
	{
		
		return 10;
	}
	
}


