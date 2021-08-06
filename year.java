//Input year and number of days of that year. Print the date
//Write absorption law and prove it using truth table.
//Draw XOR gate using Nand gate.
import java.util.*;
public class year
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int y,n,k=0;
        System.out.println("Enter year and number of day of year");
        y=in.nextInt();
        n=in.nextInt();
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String m[]={"January","Februrary","March","April","May","June","July","August","September","October","November","December"};
        if((y%4==0&&y%100!=0)||(y%100==100&&y%400==0))
        a[1]=29;
        while(k<12)
        {
            if(a[k]<n)
            n=n-a[k];
            else
            break;
            k++;
        }
        if(n==1||n==21||n==31)
        System.out.println(n+"st "+m[k]+" "+y);
        else if(n==2||n==22)
        System.out.println(n+"nd "+m[k]+" "+y);
        else if(n==3||n==23)
        System.out.println(n+"rd "+m[k]+" "+y);
        else
        System.out.println(n+"th "+m[k]+" "+y);
    }
}