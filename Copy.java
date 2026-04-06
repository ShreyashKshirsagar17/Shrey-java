package practice1;

public class Copy {

	public static void main(String[] args) {
		int A[]= {10,20,30,40,50,60,70};
		int B[]=new int [10];
		int j=0;
		for(int i=0;i< 	A.length;i++)
		{
			B[j]=A[i];
			j++;
		}
		
		for(int x:B)
			System.out.print(x+" ,");

	}

}
