class Employee
{
    int empid;
    String empname;
    float salary;
    String address;
    Employee()
    {
        empid=123;
        empname="Malavika G Raj";
        salary=45699;
        address="Pulari";
    }
}

class Teacher extends Employee
{
    String department;
    String subject;
    Teacher()
    {
        department="CS";
        subject="C";
    }
    void display()
    {
        System.out.println("Teachers Details:...");
        System.out.println("Teacher's id: "+empid);
        System.out.println("Teacher's name: "+empname);
        System.out.println("Teacher's salary: "+salary);
        System.out.println("Teacher's address: "+address);
        System.out.println("Teacher's department: "+department);
        System.out.println("Teacher's subject: "+subject);
    }

}

class Emp{
    public static void main(String args[])
    {
        Teacher[] t=new Teacher[10];
        for(int i=0;i<10;i++)
        {
            t[i]= new Teacher();
        }
        for(int i=0;i<10;i++)
        {
            t[i].display();
        }
        // for (Teacher teacher : t) {
        //     teacher=new Teacher();    
        // }
        // for (Teacher teacher : t) {
        //     teacher.display();    
        // }
        
    }
}