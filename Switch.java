import java.util.*;
public class Switch {

    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        String button=s.next();

        switch(button)
        {
            case "+" :System.out.println(a+b);
            break;

            case "-": System.out.println(a-b);
            break;

             case "*": System.out.println(a*b);
            break;

             case "/": System.out.println(a/b);
            break;

            default : System.out.println("Enter correct oprator");



        }

    }
}
