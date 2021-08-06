// Write a program to input n numbers and name in SDA. Arrange them in ascending order. Input a number and search in the array using binary search.
import java.util.*;
public class srch
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,m=0,j,k,s,ub,lb,mid,f=0;
        String l;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        int a[]=new int[n];
        String nm[]=new String[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter name and number");
            nm[i]=in.nextLine();
            a[i]=in.nextInt();
           for(i=0;i<n-1;i++)
           {
              m=i;
              for(j=1+i;j<n;j++)
              if(a[j]<a[m])
              m=j;
           }
           k=a[m];
           a[m]=a[i];
           a[i]=k;
           l=nm[m];
           nm[m]=nm[i];
           nm[i]=l;
        }
        for(i=0;i<n;i++)
        System.out.println(nm[i]+""+a[i]);
        System.out.println("Enter a number to search");
        s=in.nextInt();
        lb=0;
        ub=n-1;
        while(lb<ub)
        {
        mid=(lb+ub)/2;
        if(s==a[mid]){
        System.out.println("Serach Successfull");
        f=1;
        }
        else if(s<a[mid])
        ub=m-1;
        else
        lb=m+1;
        }
        if(f==0)
        System.out.println("Search unsuccessfull");
    }
}