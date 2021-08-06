import java.util.*;
public class border
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int m,n,i,j,s=0;
        System.out.println("Enter the value of n and m");
        n=in.nextInt();
        m=in.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter values");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            a[i][j]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==0||i==(n-1))
                {
                System.out.print(a[i][j]);
                s=s+a[i][j];
                }
                else if(j==0||j==(m-1))
                {
                System.out.print(a[i][j]);
                s=s+a[i][j];
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n"+s);
    }
}