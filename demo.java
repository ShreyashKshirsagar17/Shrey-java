import java.util.Scanner;
public class demo {

    public static void main(String[] args) {
        System.out.println("Hello world ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.err.println(" ");
        }
        Scanner sc =new Scanner(System.in);
        String name =sc.next();
        System.out.println(name    );

        Scanner wv=new Scanner(System.in);
        String nav=wv.nextLine();
        System.out.println(nav);

        // Scanner s=new Scanner(System.in);
        int a=wv.nextInt();
        int b=wv.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}