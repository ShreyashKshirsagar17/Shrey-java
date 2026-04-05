package practice1;
import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any no :");
		
		int n=sc.nextInt();
		int r;
		int count=0;
		while(n!=0)
		
		{
			n=n/10;
			count++;
			
		}
		System.out.println("total no is :"+count);
		
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			System.out.println(r);
		}
		
		
		
	}

}
