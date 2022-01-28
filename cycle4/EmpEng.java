import java.util.*;
class EmpEng
{
    public static void main(String args[])
    {
      engineer e=new engineer();
      e.display();
      e.calcsalary();
    }

   void display()
   {
     System.out.println("Name of the class is Employee");
   }
   void calcsalary()
   {
     System.out.println("Emloyee salary:10000");
   }
}

class engineer extends EmpEng
{
    void calcsalary()
    {
      
      System.out.println("salary of engineer is 20000");
    }
}

