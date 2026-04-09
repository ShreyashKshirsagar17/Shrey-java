package practice1;

public class HCF {

	int gcd(int n,int m)
	{
		while(m!=n)
		{
			if(m>n)m=m-n;
			else n=n-m;
		}
		return m;
	}
	public static void main(String[] args) {
		HCF x=new HCF();
		System.out.println(x.gcd(35, 56));
		
	}

}
