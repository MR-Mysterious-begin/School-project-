import java.util.*;
public class date
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int d,y,N;
        System.out.println("Enter date, year and days after");
        d=in.nextInt();
        y=in.nextInt();
        N=in.nextInt();
        if(!(d<=366)||1000==0||!(N>=1&&N<=100))
        {
            System.out.println("Data invalid");
            System.exit(0);
        }
        if(y)
    }
}