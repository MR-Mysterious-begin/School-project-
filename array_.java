import java.util.*;
public class array_
{
    int n,y,f;
    int a[];
    array_(int s)
    {
        n=s;
        a=new int[n];
    }
    public static int prime(int y)
    {
        int j,m=0;
        for(j=2;j<y;j++)
        {
            if(y%j==0)
            {
                m++;
                break;
            }
        }
        if(m==0)
        return 1;
        else
        return 0;
    }
    void dyspprime()
    {
        int j;
        for(j=0;j<n;j++)
        System.out.println(a[j]);
        
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int k,j;
        System.out.println("Enter syze of array");
        k=in.nextInt();
        array_ ob=new array_(k);
        System.out.println("Enter numbers");
        for(j=0;j<ob.n;j++)
        ob.a[j]=in.nextInt();
        ob.dyspprime();
    }
}