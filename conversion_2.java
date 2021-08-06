import java.util.*;
public class conversion_2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n[]=new int[20];
        int s[]=new int[20];
        int n1,i,r,d,a=0;
        for(i=0;i<20;i++)
        {
            System.out.println("Enter binary number");
            n[i]=in.nextInt();
        }
        for(i=0;i<20;i++)
        {
            n1=n[i];
            while(n1!=0)
            {
                r=n1%10;
                n1=n1/10;
                d=r*(int)Math.pow(2,a);
                s[i]=s[i]+d;
                a+=1;
            }
        }
       for(i=0;i<20;i++)
       {
           System.out.println("The binary code is "+n[i]);
           System.out.println("The decimal code is "+s[i]);
       }
    }
}