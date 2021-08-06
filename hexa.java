import java.util.*;
public class hexa
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
            r=q%16;
            q=q/16;
            if(r>=10)
            b=(char)(r+55)+b;
            else
            b=r+b;
        }
        System.out.println("The hexa-decimal code is "+b);
    }
}