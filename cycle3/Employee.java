import java.util.*;
public class Employee 
{
    String name;
    int empcode,phn;

    void readdetails()
    {      
        Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the name of the employee :");
        name = sc.nextLine();

        System.out.println("Enter the employee code :");
        empcode = sc.nextInt();
        
        System.out.println("Enter the phone number :");
        phn = sc.nextInt();
        System.out.println();
    }
  
    void printdetails()
    {

       System.out.println("Name:"+name);
       System.out.println();
       System.out.println("Empcode:"+empcode);
       System.out.println();
       System.out.println("Phone no:"+phn);
       System.out.println();
    }
  public static void main (String[] args) 
  {
    int i;
    Employee e[]=new Employee[10];
    System.out.println("Employee Details\n");
    System.out.println();
    for(i=0;i<5;i++)
    {
        e[i]=new Main();
        e[i].details();
    }
    System.out.println("Entered details are\n");
    for(i=0;i<5;i++)
    {
        e[i].printdetails();
    }
  }
}
