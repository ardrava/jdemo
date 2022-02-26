import java.util.*;
class Employee 
{
    String name;
    int age;
    int phn;
    String address;
    double salary;
    
    Employee(String n,int a,int ph,String adr,double sal)
    {
        name=n;
        age=a;
        phn=ph;
        address=adr;
        salary=sal;
    }
    
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Phone:"+phn);
        System.out.println("Address:"+address);
    }
    public void printsal()
    {
        System.out.println("Salary:"+salary);
    }
}

class Officer extends Employee
{
    String specialization;
    Officer(String n,int a,int ph,String adr,double sal,String spec)
    {
        super(n,a,ph,adr,sal);
        specialization=spec;
    }
    
    void Officerdetail()
    {
        display();
        printsal();
        System.out.println("Specialization:"+specialization);
    }
}

class Manager extends Employee
{
    String department;
    Manager(String n,int a,int ph,String adr,double sal,String dep)
    {
        super(n,a,ph,adr,sal);
        department=dep;
    }
    
    void Managerdetail()
    {
        display();
        printsal();
        System.out.println("Department:"+department);
    }
}

class Employeedetails
{
    public static void main(String args[])
    {
       Officer o=new Officer("Saranya",25,996611,"klm",20000,"Accountant"); 
       Manager m=new Manager("Sanya",25,996600,"ktm",20000,"Sales"); 
       System.out.println("info about officer");
       o.Officerdetail();
       System.out.println("info about manager");
       m.Managerdetail();
    }
}
