import java.util.*;
public class frequeny
{
    public static void main()
    {
        Scanner in =new Scanner(System.in);
        int n,max,min,i,f=0,j;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            a[i]=in.nextInt();
        }
        max=a[1];
        min=a[1];
        for(i=0;i<n;i++)
        {
            if(max<a[i])
            max=a[i];
            if(min>a[i])
            min=a[i];
        }
        for(j=min;j<=max;j++)
        {
            for(i=0;i<n;i++)
            {
                if(a[i]==j)
                f++;
            }
            if(f!=0)
            System.out.println("The frequency of "+j+" is "+f);
            f=0;
        }
    }
}