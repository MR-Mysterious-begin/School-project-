//WAP to enter a binary number and convert it into Decimal Form.
import java.util.*;
public class decimal
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,n1,r,d,s=0,a=0;
        System.out.println("Enter binary number");
        n=in.nextInt();
        n1=n;
        while(n1!=0)
        {
            r=n1%10;
            n1=n1/10;
            d=r*(int)Math.pow(2,a);
            s=s+d;
            a+=1;
        }
        System.out.println("The decimal code is "+s);
    }
}