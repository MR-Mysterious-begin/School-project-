import java.util.*;
public class add1
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a,b,max,min,d,d1,n=0;
        String s="";
        System.out.println("Enter two binary numbers");
        a=in.nextInt();
        b=in.nextInt();
        max=Math.max(a,b);
        min=Math.min(a,b);
        d=max%10;
        d1=min%10;
        max=max/10;
        min=min/10;
        while(max!=0)
        {
            if(d==1&&d1==1)
            {
                if(n==1)
                {
                    s="1"+s;
                    n=1;
                }
                else
                {
                    s="0"+s;
                    n=1;
                }
            }
            else if(n==1)
            {
                if(d==1||d1==1)
                {
                    s="0"+s;
                    n=1;
                }
                else
                {
                    s="1"+s;
                    n=0;
                }
            }
            else
            s=Integer.toString(d+d1+n)+s;
            d=max%10;
            d1=min%10;
            max=max/10;
            min=min/10;
        }
        System.out.println("The sum is "+s);
    }
}