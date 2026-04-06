package practice1;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no :");
		
		int n=sc.nextInt();
		
		int a=1;
		int b=2;
		
		int sum;
		System.out.print(a+" ,"+b+" ,");
		for(int i=0;i<n-2;i++)
		{
			sum=a+b;
			System.out.print(sum+" , ");
			a=b;
			b=sum;
			
		}
	}

}
