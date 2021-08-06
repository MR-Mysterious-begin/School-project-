import java.util.*;
public class freq
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String n,nm,n1;
        System.out.println("Enter two sentences");
        n=in.nextLine();
        n1=in.nextLine();
        n=n.concat(n1);
        n=n+" ";
        int l=n.length(),l1,i;
        for(i=0;i<l;i++)
        {
            if(n.charAt(i)!=' ')
            {
                nm=nm+n.charAt(i);
                l1="";
            }
            else
            {      
            }
        }
    }
}