//Wap to input a name and print initial with surname
import java.util.*;
public class initial
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String n,nm="";
        int i,i1;
        System.out.println("Enter name");
        n=in.nextLine();
        i1=n.lastIndexOf(' ');
        n=" "+n;
        for(i=0;i<i1;i++)
        {
            if(n.charAt(i)==' ')
            {
                nm=n.charAt(i+1)+".";
            }
        }
        System.out.println(nm+n.substring(i1));
    }    
}