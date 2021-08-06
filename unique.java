import java.util.*;
public class unique
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String n;
        int i,j,f=0;
        System.out.println("Enter a word");
        n=in.next();
        int l=n.length();
        for(i=0;i<l;i++)
        {
            for(j=0;j<i;j++)
            {
                if(n.charAt(i)==n.charAt(j))
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==1)
        {
            System.out.println("Unique word");
        }
    }
}