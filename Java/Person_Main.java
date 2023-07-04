import java.util.Scanner;

class Person
{
    String name,address,gender;
    int age=0;
    Person()
    {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter person's Name: ");
        name=sc.nextLine();
        System.out.println("Enter Age: ");
        age=sc.nextInt();
        System.out.println("Enter Address: ");
        address=sc.nextLine();
        System.out.println("Enter gender: ");
        gender=sc.nextLine();
        // sc.close();
    }

}

class Employee1 extends Person
{
    int empid;
    String companyName,qualification;
    Employee1()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        empid=sc.nextInt();
        System.out.println("Enter Company Name: ");
        companyName=sc.nextLine();
        System.out.println("Enter Employee Qualification: ");
        qualification=sc.nextLine();
        // sc.close();
    }
}

class Teacher1 extends Employee1
{
    int teacher_id;
    String department;
    String subject;
    Teacher1()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter department Name: ");
        department=sc.nextLine();
        System.out.println("Enter Subject: ");
        subject=sc.nextLine();
        // sc.close();
    }
    void display()
    {
        System.out.println("Teachers Details:...");
        System.out.println("Teacher's id: "+empid);
        System.out.println("Teacher's name: "+name);
        System.out.println("Teacher's age: "+age);
        System.out.println("Teacher's gender: "+gender);
        System.out.println("Teacher's address: "+address);
        System.out.println("Teacher's department: "+department);
        System.out.println("Teacher's subject: "+subject);
    }

}
class Person_Main
{
    public static void main(String[] args)
    {
    int n;
    Scanner sc =new Scanner(System.in);

    System.out.println("Enter Limit: ");
    n=sc.nextInt();
    
    Teacher1[] t=new Teacher1[n];
        for(int i=0;i<n;i++)
        {
            t[i]= new Teacher1();
        }
        for(int i=0;i<n;i++)
        {
            t[i].display();
        }
        sc.close();
    }
    
}
