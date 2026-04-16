package practice1;

public class Reverse {
	
	static int ulta(int n)
	{
		
		int rev =0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		
		return rev;
	}
	
	static int [] ulta(int A[])
	
	{
		int B[]=new int [A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		{
			B[j]=A[i];
			
		}
		return B;
	}
	public static void main (String[]args)
	{
		System.out.println(ulta(123));
		System.out.println(ulta(new int [] {1,2,3,4,5,6,7}));
		
		
	}
}
