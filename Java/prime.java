import java.util.Scanner;
class prime
{
    public static void main(String[] args)
    {
        int n,i,flag=0;
        Scanner cv=new Scanner(System.in);
        System.out.println("enter the number:");
        n=cv.nextInt();
        if(n==1)
        {
            System.out.println(1);
        }
        else
        {
            for(i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    System.out.println("NOT PRIME:");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("prime:");
            }
        }
    }
}