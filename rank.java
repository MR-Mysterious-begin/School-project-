import java.util.*;
public class rank
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,t,m;
        String s,sn;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        int a[]=new int[n];
        String nm[]=new String[n];
        System.out.println("Enter your name");
        sn=in.nextLine();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter name and marks");
            nm[i]=in.nextLine();
        }
        for(i=0;i<n;i++)
        {
            m=i;
            for(j=i+1;j<n+1;j++)
            {
                if(a[m]>a[j])
                m=j;
                t=a[i];
                a[i]=a[m];
                a[m]=t;
                s=nm[i];
                nm[i]=nm[m];
                nm[m]=s;
            }
        }
        System.out.println("Name\t\t\tRank");
        for(i=0;i<n;i++)
        System.out.println(nm[i]+"\t\t\t"+a[i]);
    }
}