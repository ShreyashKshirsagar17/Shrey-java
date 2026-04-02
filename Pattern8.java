import java.util.*;
public class Pattern8 {

    public static void main(String[]args)
    {
        System.out.println("enter the no for n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
           
            
            for(int j=0;j<i+1;j++)
            {
                int sum=i+j;
              if(sum%2==0)
              {
                System.out.print(1);
              }
              else{
                System.out.print(0);
              }
            }
            System.out.println();
        } 
}

}
