//Input 20 no. array and 30 no. array B. Merge bothe the array and store into array c.Sort array c and print it.
import java.util.*;
public class sort_2
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[20];
        int b[]=new int[30];
        int c[]=new int[50];
        int i,n=0,j,m,k;
        System.out.println("Enter number in array a");
        for(i=0;i<20;i++)
        a[i]=in.nextInt();
        System.out.println("Enter numbers in array b");
        for(i=0;i<30;i++)
        b[i]=in.nextInt();
        for(i=0;i<20;i++)
        {
            c[n]=a[i];
            n++;
        }
        for(i=0;i<30;i++)
        {
            c[n]=b[i];
            n++;
        }
        for(i=0;i<50-1;i++)
        {
            m=i;
            for(j=i+1;j<50;j++)
            if(c[m]>c[j])
            m=j;
            k=c[m];
            c[m]=c[j];
            c[j]=k;
        }
        for(i=0;i<50;i++)
        System.out.println(c[i]);
    }
}