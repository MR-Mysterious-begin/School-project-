//Write a progrsm to input value on n*m matrix. Thereafter print it. Also print the max and min value.
//WAP to create n*m matrix and perform the followin: Print the border element in border format and prinnt the sum of element inside the border
import java.util.*;
public class dda
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int m,n,i,j,max,min,s=0;
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
            for(j=0;j<n;j++)
            System.out.print(a[i][j]);
            System.out.println();
        }
        max=a[0][0];
        min=a[0][0];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            if(max<a[i][j])
            max=a[i][j];
            if(min>a[i][j])
            min=a[i][j];
        }
        System.out.println(max+" "+min);
    }
}