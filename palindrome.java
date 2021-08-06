// Input a sentence and print all palindrome word
//Input s number in sda, print the arrary, remove the duplicate and print the array
import java.util.*;
public class palindrome
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String s,nm1="",nm="";
        System.out.println("Enter a sentence");
        s=in.nextLine();
        int l,i;
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)!=' '){
            nm=s.charAt(i)+nm;
            nm1=nm1+s.charAt(i);
        }
            else
            {
                if(nm.equalsIgnoreCase(nm1))
                System.out.println(nm);
                nm="";
                nm1="";
            }
        }
    }
}