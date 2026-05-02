package work1;
import java.util.*;

public class IET1 {

	public static void main(String[]args)
	{
		int[]num= {1,2,3,4};
		int n=num.length;
		
		int[]output=new int[n];
		
		output[0]=1;
		
		for(int i=1;i<n;i++)
		{
			output[i]=output[i-1]*num[i-1];
		}
		
		
		int right=1;
		for(int i=n-1;i>=0;i--)
		{
			output[i]=output[i]*right;
			right=right*num[i];
			
			
		}
		System.out.println(Arrays.toString(output));
	}
}
