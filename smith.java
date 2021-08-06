import java.util.*;
public class smith
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,n1,d=0,s=0,k=2,p=0;
        System.out.println("Enter a number");
        n=in.nextInt();
        n1=n;
        while(n1!=0)
        {
            d=d%10;
            n1=n1/10;
            s=s+d;
        }
        while(k<=n)
        {
            if(n%k==0)
            {
             n1=k;
             while(n1!=0)
             {
                 d=d%10;
                 n1=n1/10;
                 p=p+d;
                }
            }
            k+=1;
        }
        if(s==p)
        System.out.println("Smith no.");
        else
        System.out.println("Not a Smith no.");
    }
}