import java.util.*;
public class sentence
{
    public static void main()
    {
        Scanner in =new Scanner(System.in);
        String n,a[],nm="";
        int i,l,m=0;
        System.out.println("Enter a sentence");
        n=in.nextLine();
        l=n.length();
        n=n+" ";
        for(i=0;i<l;i++)
        {
            if(n.charAt(i)!=' ')
            {
                nm=nm+n.charAt(i);
            }
            else
            {
                a[m]=nm;
                nm="";
                m++;
            }
        }
    }
}