import java.util.*;
public class Pattern6 {

    public static void main(String[]args)
    {
        System.out.println("enter any no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int num=1;
            for(int j=0;j<n-i;j++)
            {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }

    }
}
