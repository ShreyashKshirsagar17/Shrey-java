package practice1;
import java.util.Scanner;

public class checkPrime {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no:");
		
		int n=sc.nextInt();
		if(n==2)
		{
			System.out.println("no is prime");
		}
		
		for(int i=2;i<n;i++)
		{
			
			if(n%i==0)
			{
				System.out.println(" Given no is a not prime");
				break;
			}
			else
			{
				System.out.println(" Given no is a prime");
				break;  
				
			}
			
		}
		
	}

	
}
