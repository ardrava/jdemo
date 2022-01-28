import java.util.*;
public class Concatinate 
{
     public static void main(String args[])
     {
         int a,b;
         String w1,w2;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the first number");
         a=sc.nextInt();
         System.out.println("Enter the second number");
         b=sc.nextInt();
         System.out.println("Enter the first string");
         w1=sc.nextLine();
         System.out.println("Enter the second string");
         w2=sc.nextLine();
         
         Concatinate cn=new Concatinate();
         cn.concat(a,b);
         cn.concat(w1,w2);
     }
  
     void concat(int a,int b)
     {
         System.out.println("Concatenated numbers are" +a+b);
         
     }
     void concat(String w1,String w2)
     {
         System.out.println("Concatenated strings are" +w1+w2);
         
     }
}

