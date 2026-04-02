import java.util.*;
public class Pattern7 {

    public static void main(String[]args)
    {
        System.out.println("enter the no for n");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int num=1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(num);
                System.out.print(" ");
                num++;
            }
            System.out.println();
        }


    }
}
