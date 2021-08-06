import java.util.*;
public class init
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of names");
        int a=in.nextInt();
        String n[]=new String[a];
        String nm[]=new String[a];
        int i,j,l;
        for(i=0;i<a;i++)
        {
            System.out.println("Enter name");
            n[i]=in.nextLine();
            nm[i]="";
        }
        for(i=0;i<a;i++)
        {
            n[i]=" "+n[i];
            l=n[i].lastIndexOf(' ');
            for(j=0;j<l;j++)
            {
                if(n[i].charAt(j)==' ')
                {
                    nm[i]=nm[i]+n[i].charAt(j+1)+".";
                }
            }
            nm[i]=nm[i]+n[i].substring(l+1);
        }
        for(i=0;i<a;i++)
        {
            System.out.println(nm[i]);
        }
    }
}