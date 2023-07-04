import java.util.Scanner;
class arm
{
    public static void main(String[] args)
    {
        int n,temp=0,sum=0,r,z;
        Scanner cv=new Scanner(System.in);
        System.out.println("enter the number:");
        n=cv.nextInt();
        n=temp;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(n==temp)
        {
            System.out.println("\n it is an armstrong number:");
        }
        else
        {
            System.out.println("\nit is not an armstrong number");
        }
    }
}
