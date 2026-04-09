package practice1;
import java.util.*;

public class Student {
	
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	int sum;

	public void total()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for sub 1:");
		m1=sc.nextInt();
		System.out.println("Enter marks for sub 2:");
		m2=sc.nextInt();
		System.out.println("Enter marks for sub 3:");
		m3=sc.nextInt();
		sum=m1+m2+m3;
		System.out.println(sum);
	}
	
	public double Average()
	{
		return sum/3;
	}
	
	public void Grad()
	{
		double avg=Average();
		if(avg>=70)
			System.out.println("grad A");
		else if(avg>60)
			System.out.println("grad B");
		else if (avg>50)
			System.out.println("grad C");
		else if(avg>40)
			System.out.println("grad D");
		else
			System.out.println("your dada FAIL");
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.total();		
		System.out.println(s1.Average());
		s1.Grad();

	}

}
