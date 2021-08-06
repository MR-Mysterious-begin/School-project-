import java.util.*;
public class cprime
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,l,i,f=0;
        String n1,d;
        System.out.println("Enter a number");
        n=in.nextInt();
        cprime ob=new cprime();
        n1=Integer.toString(n);
        l=n1.length();
        if(ob.chk(n))
        {
            for(i=0;i<l;i++)
            {
                d=Integer.toString(n%10);
                n1=d+n1.substring(0,l);
                if(ob.chk(Integer.valueOf(n1)))
                continue;
                else
                {
                    f=1;
                    break;
                }
            }
        }
        else
        {
            System.out.println("The number is not a circular prime number");
            System.exit(1);
        }
        if(f==0)
        System.out.println("Number is circular prime");
    }
    boolean chk(int a)
    {
        int i,f=0;
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        return(false);
        else
        return(true);
    }
}