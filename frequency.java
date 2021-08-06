import java.util.*;
public class frequency
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,f=0,f1=0,f2=0,f3=0,f4=0;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter marks of student");
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>=90)
            f++;
            else if(a[i]>=70)
            f1++;
            else if(a[i]>=50)
            f2++;
            else if(a[i]>=40)
            f3++;
            else
            f4++;
        }
        System.out.println("Marks Range\t\t\tNo. of students");
        System.out.println(">= 90\t\t\t"+f);
        System.out.println("<90 and >=70\t\t\t"+f1);
        System.out.println("<70 and >=50\t\t\t"+f2);
        System.out.println("<50 and >=40\t\t\t"+f3);
        System.out.println("<40\t\t\t"+f4);
    }
}