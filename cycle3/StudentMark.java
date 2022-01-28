import java.util.*;
public class Main 
{
     public static void main(String args[])
     { 
      Student st=new Student();
      st.read();
      st.display();
     }
}
class Student
{
    String name;
    int rollno,i;
    int m[]=new int[5];

    void read()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Name of the student"); 
       name=sc.nextLine(); 
  
       System.out.println("Rollno of the student"); 
       rollno=sc.nextInt(); 
       System.out.println("Enter the marklist of 5 students");
       for(i=0;i<=5;i++) 
        {
         System.out.println("Marks of five subjects"+(i+1));
         m[i]=sc.nextInt();
        }
       
    }
    void display()
    {
      System.out.println("Student Marklist:");
      System.out.println("Name "+name); 
      System.out.println("Rollno:"+rollno); 
      for(i=0;i<=5;i++)  
      {
      System.out.println("Marks of five subjects "+(i+1)+"is"+m[i]);
      }
    }
}
