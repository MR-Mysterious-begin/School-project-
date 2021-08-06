import java.util.*;
public class dob
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int d,d1,q,y,y1,m,m1;
        System.out.println("Enter you birth date, birth month number and year");
        d=in.nextInt();
        m=in.nextInt();
        y=in.nextInt();
        System.out.println("Enter you current date, birth month number and year");
        d1=in.nextInt();
        m1=in.nextInt();
        y1=in.nextInt();
        int a[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String mo[]={"January","Februrary","March","April","May","June","July","August","September","October","November","December"};
        int dd,md,yd=y1-y;
        m=m-1;
        m1=m1-1;
    }
}