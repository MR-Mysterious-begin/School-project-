import java.util.*;
public class repeat
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String str="",nm="";
        System.out.println("Enter word");
        str=in.next();
        str=str.toUpperCase();
        int f=0,j,i,l=str.length();
        nm=nm+str.charAt(0);
        for(i=1;i<l;i++)
        {
            char ch=str.charAt(i);
            for(j=0;j<i;j++)
            if(ch==str.charAt(j))
            {
                f=0;
                break;
            }
            else
            f=1;
            if(f==1)
            nm=nm+ch;
        }
        System.out.println(nm);
    }
}