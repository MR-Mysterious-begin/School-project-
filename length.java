import java.util.*;
public class length
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String n,nm="",n1="",n2="";
        System.out.println("Enter a sentence");
        n=in.nextLine();
        n=n+"";
        int i,l,l1,max=0,min;
        l=n.length();
        min=l;
        for(i=0;i<l;i++)
        {
            if(n.charAt(i)!=' ')
            nm=nm+n.charAt(i);
            else
            {
                l1=nm.length();
                if(l1>max)
                {
                max=l1;
                n1=nm;
                }
                if(l1<min)
                {
                min=l1;
                n2=nm;
                }
                nm="";
            }
        }
        System.out.println("Max word"+n1+"Length"+max);
        System.out.println("Min word"+n2+"Length"+min);
    }
}