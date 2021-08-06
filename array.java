import java.util.*;
public class array
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int m,n,i,j,f=0,k=1;
        System.out.println("Enter the value of m and n");
        m=in.nextInt();
        n=in.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        int c[]=new int[m+n];
        System.out.println("Enter values of array a");
        for(i=0;i<m;i++)
        a[i]=in.nextInt();
        System.out.println("Enter values of array b");
        for(i=0;i<n;i++)
        b[i]=in.nextInt();
        c[0]=a[0];
        for(i=1;i<m;i++)
        {
            for(j=0;j<i;j++)
            {
                if(a[i]==a[j])
                f++;
            }
            if(f==0)
            {
                c[k]=a[i];
                k++;
            }
            f=0;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<k+i;j++)
            {
                if(b[i]==c[j])
                f++;
            }
            if(f==0)
            {
                c[k]=b[i];
                k++;
            }
            f=0;
        }
        for(i=0;i<k;i++)
        System.out.println(c[i]);
    }
}