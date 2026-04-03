import java.util.*;
public class Pattern9 {
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            int space =2*(n-1);
        
        for(int j=1;j<=i;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        System.out.println();
        
    }
}
}
