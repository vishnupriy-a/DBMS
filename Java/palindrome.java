import java.util.Scanner;
class palindrome
{
    public static void main(String[] args)
    {
        String str="",rev="";
        Scanner cv=new Scanner(System.in);
        System.out.println("enter the number:");
        str=cv.next();
        int v=str.length();
        for(int i=(v-1);i>=0;--i)
        {
            rev=rev+str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println("string is palindrome:");
        }
        else
        {
           System.out.println("string is not palindrome:"); 
        }
    }
}
        