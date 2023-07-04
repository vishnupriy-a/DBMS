import java.util.Scanner;
class fact
{
    public static void main(String[] args)
    {
        int n,f=1,i;
        Scanner cv=new Scanner(System.in);
        System.out.println("enter the number:");
        n=cv.nextInt();
        if(n==1)
        {
            System.out.println(1);
        }
        else
        {
            for(i=2;i<=n;i++)
            {
                f=f*i;
            }
            System.out.println(f); 
        }
    }
}