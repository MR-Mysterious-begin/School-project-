import java.util.*;
public class conversion_3
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,q,r;
        String b="";
        System.out.println("Enter an integer");
        n=in.nextInt();
        q=n;
        while(q!=0)
        {
            r=q%8;
            q=q/8;
            b=r+b;
        }
        System.out.println("The octal code is "+b);
    }
}