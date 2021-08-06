//input number of words in sda. Sort the array in alphabetical order.Then print the sorted array.
//Input a sentence and print shortest and the longest word of the sentence with their length.
import java.util.*;
public class sda
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,d,m;
        String k;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        String nm[]=new String[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a word");
            nm[i]=in.next();
        }
        for(i=0;i<n-1;i++)
        {
            m=i;
            for(j=1+i;j<n;j++)
            {
                if(nm[m].compareTo(nm[j])>0)
                m=j;
            }
            k=nm[m];
            nm[m]=nm[i];
            nm[i]=k;
        }
        for(i=0;i<n;i++)
        System.out.println(nm[i]);
    }
}