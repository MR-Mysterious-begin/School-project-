import java.util.*;
public class remove
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String n,nm=""; char ch; int i,j,f=0,l;
        System.out.println("Enter word");
        n=in.next();
        l=n.length();
        for(i=0;i<l;i++)
        {
            ch=n.charAt(i);
            for(j=0;j<i;j++)
            {
                if(ch==n.charAt(j))
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            nm=nm+ch;
            f=0;
        }
        System.out.println(nm);
    }
}