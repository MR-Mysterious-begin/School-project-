import java.util.*;
public class country
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,k=0,lb=0,ub,f,ns,m=0;
        String t="";
        System.out.println("Enter the value of n");
        n=in.nextInt();
        String cn[]=new String[n];
        int cc[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter country name and code");
            cn[i]=in.nextLine();
            cc[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(cc[j-1]>cc[j])
                {
                    k=cc[j];
                    cc[j]=cc[j-1];
                    cc[j-1]=k;
                    t=cn[j];
                    cn[j]=cn[j-1];
                    cn[j-1]=t;
                }
            }
        }
        for(i=0;i<n;i++)
        System.out.println(cn[i]+"\t"+cc[i]);
        System.out.println("Enter country code to be searched");
        ns=in.nextInt();
        ub=n-1;
        f=0;
        while(lb<=ub)
        {
            m=(lb+ub)/2;
            if(ns==cc[m])
            {
                f=1;
                break;
            }
            if(ns>cc[m])
            lb=m+1;
            if(ns<cc[m])
            ub=m-1;
        }
        if(f==1)
        System.out.println(cn[m]+""+cc[m]);
        else
        System.out.println("Not Found");
    }
}