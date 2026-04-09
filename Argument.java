package practice1;

public class Argument {

	
	static void show(int ...A)
	{
			for(int x:A)
			{
				System.out.println(x);
			}
	}
	
	static void show(double B[])
	{
		for (double x:B)
		{
			System.out.println(x);
		}
	}
	static void show(int start, String...s)
	{
		for (int i=0;i<s.length;i++)
		{
			System.out.println(start + " ."+s[i]);
			start++;
		}
	}
	
	public static void main(String[] args) {
		show(1,2,3,4,5,6);
		System.out.println("------------------");
		show(new int [] {3,5,7,9,11,13});
		System.out.println("------------------");
		show(5,"shreyash","sanket","gopal","sarvesh","hritik","atharva");

	}

}
