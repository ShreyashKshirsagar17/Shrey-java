package practice1;
import java.util.Scanner;


public class Palindrom {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no:");
		
		int n=sc.nextInt();
		
		int m=n;
		int r;
		int rev=0;
		
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			
		}
		if(rev==m)
			System.out.println("given no is ");
		else
			System.out.println("givem mo is not a palindrom");
		
	}

}
