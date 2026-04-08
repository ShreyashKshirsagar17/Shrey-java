package practice1;

public class D2Array {

	public static void main(String[] args) {
		
		int A[][]= {{1,2,3,4,},{2,4,6,8},{1,3,5,7}};
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ,");
			}
			System.out.println();
		}

	}

}
