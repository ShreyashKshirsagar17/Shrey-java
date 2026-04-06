package practice1;
import java.util.Scanner;

public class Numbers {
	
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any no :");
		
		int n=sc.nextInt();
		
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.println(sum);
	}
}
