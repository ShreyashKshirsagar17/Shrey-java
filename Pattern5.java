import java.util.*;
public class Pattern5 {

    public static void main(String []args)
    {
        System.out.println("enter the no ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        

        for(int i=0;i<n;i++)
        {
            int num=1;
             
            for(int j=0;j<i+1;j++)
            {
                System.out.print(num);
                num++;
            }
            
            System.out.println();

        }

    }
}
