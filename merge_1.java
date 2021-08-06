import java.util.*;
public class merge_1
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[20];
        int b[]=new int[30];
        int c[]=new int[50];
        int i,n=0,j,f=0;
        System.out.println("Enter numbers in array a");
        for(i=0;i<20;i++)
        a[i]=in.nextInt();
        for(i=0;i<30;i++)
        b[i]=in.nextInt();
        for(i=0;i<20;i++)
        {
            for(j=0;j<i;j++)
            {
                if(a[i]==c[j])
                {
                    f=1;
                    break;
                }
                if(f==0)
                c[n]=a[i];
            }
            
        }
    }
}