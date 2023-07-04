import java.util.Scanner;

interface Ap
{
    void area();
    void perimeter();
    void read();
}

class Rectangle implements Ap{
    float l,b;
    public void read()
    {
        System.out.println("Enter the length and breadth of the Rectangle: ");
        Scanner sc=new Scanner(System.in);
        l=sc.nextFloat();
        b=sc.nextFloat();

    }
    public void area()
    {
        System.out.println("Area of the Rectangle is: "+l*b);
    }
    public void perimeter()
    {
        System.out.println("Perimeter of the Rectangle is: "+2*(l+b));
    }
    
}
class Circle implements Ap{
    float r;
    public void read()
    {
        System.out.println("Enter the radius of the Circle : ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();

    }
    public void area()
    {
        System.out.println("Area of the Circle is: "+3.14*(r*r));
    }
    public void perimeter()
    {
        System.out.println("Perimeter of the Circle is: "+2*(3.14*r));
    }
    
}
class Inh {
    public static void main(String args[])
    {
        Ap rect= new Rectangle();
        Ap cir= new Circle();
        int i=1;
        do{
            System.out.print("Menu\n 1.Area and Perimeter of the Circle \n 2.Area and Perimeter of the Rectangle \n");
            Scanner sc=new Scanner(System.in);
            int op=sc.nextInt();
            switch(op)
            {
                case 1: rect.read();
                        rect.area();
                        rect.perimeter();
                        break;
                case 2: cir.read();
                        cir.area();
                        cir.perimeter();
                        break;
                default: System.out.println("Invalid option");

            }
            System.out.println("Do you Want to continue: press 0 to exit and press 1 to continue;");
            i=sc.nextInt();
        }while(i!=0);
        
    }
}