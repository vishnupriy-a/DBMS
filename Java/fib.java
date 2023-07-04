import java.util.Scanner;
class fib
{
    public static void main(String[] ARGS)
    {
        int a,b,c;
        Scanner cv=new Scanner(System.in);
        System.out.println("enter the range:");
        int n=cv.nextInt();
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
