//WAP to enter 20 nos in SDA and convert each number to binary. Store it in array B PRint botha array
import java.util.*;
public class conversion
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n[]=new int[20];
        int q,r,i;
        String b[]=new String[20];
        for(i=0;i<20;i++)
        {
            System.out.println("Enter an integer");
            n[i]=in.nextInt();
            b[i]="";
        }
        for(i=0;i<20;i++)
        {
            q=n[i];
            while(q!=0)
            {
                r=q%2;
                q=q/2;
                b[i]=r+b[i];
            }
        }
        for(i=0;i<20;i++)
        {
            System.out.println("The decimal code is "+n[i]);
            System.out.println("The binary code is "+b[i]);
        }
    }
}