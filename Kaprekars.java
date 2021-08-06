import java.util.*;
public class Kaprekars
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,n2,l,l1,s;
        String nm,a,b;
        System.out.println("Enter a number");
        n=in.nextInt();
        n2=n*n;
        nm=Integer.toString(n2);
        l=nm.length();
        if(l%2==0)
        {
            l1=l/2;
            a=nm.substring(0,l1);
            b=nm.substring(l1);
            s=Integer.valueOf(a)+Integer.valueOf(b);
        }
        else
        {
            l1=(l+1)/2;
            a=nm.substring(0,l1);
            b=nm.substring(l1);
            s=Integer.valueOf(a)+Integer.valueOf(a);
        }
        if(s==n)
        System.out.println("The number is kaprekar");
        else
        System.out.println("The number is not kaprekar");
    }
}