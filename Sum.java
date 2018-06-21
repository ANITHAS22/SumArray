import java.util.*;
public class Sum
{
    public static void main(String args[])
    {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int m=io.nextInt();
        int a[]=new int[n];
        int sum=0,i;
        for(i=0;i<n;i++)
        {
            a[i]=io.nextInt();
        }
        for(i=0;i<m;i++)
            {
                sum=sum+a[i];
            }
            System.out.println(sum);
            
        }
        
}
