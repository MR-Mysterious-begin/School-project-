import java.util.*;
public class arr
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,f=0;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        System.out.println(a[i]);
        for(i=0;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(a[i]==a[j])
                f=1;
            }
            if(f==0)
            System.out.println(a[i]);
            f=0;
        }
    }
}