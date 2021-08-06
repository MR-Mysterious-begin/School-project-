//WAP to input an integer number and convert it into Binary Form.
import java.util.*;
public class binary
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
            r=q%2;
            q=q/2;
            b=r+b;
        }
        System.out.println("The binary code is "+b);
    }
}