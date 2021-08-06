//Input a sentence and print each word with number of vowels and consonant.
//Input a sentence and print only unique word. 
import java.util.*;
public class num
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String n,nm="";
        int l,i,j,v=0,c=0;
        System.out.println("Enter a sentence");
        n=in.nextLine();
        n=n+"";
        l=n.length();
        for(i=0;i<l;i++)
        {
            if(n.charAt(i)!=' ')
            nm=nm+n.charAt(i);
            else
            {
                for(j=0;j<nm.length();j++)
                {
                    if(nm.charAt(i)=='a'||nm.charAt(i)=='e'||nm.charAt(i)=='i'||nm.charAt(i)=='o'||nm.charAt(i)=='u')
                    v++;
                    else
                    c++;
                }
                System.out.println(nm+" Vowels= "+v+" Consonants= "+c);
                nm="";
            }
        }
    }
}