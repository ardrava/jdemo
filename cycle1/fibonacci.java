import java.util.*;
class fibonacci
{
 public static void main (String args [])
 {
   Scanner sc=new Scanner (System.in);
   int n,n1=0,n2=1;
   System.out.println("Enter the no.of terms");
   n=sc.nextInt();
   System.out.println("First"+n"terms of fibonacci series");
   
   for(i=0;i<=n;i++)
    {
     System.out.println(n1+"");
     int sum=n1+n2;
     n1=n2;
     n2=sum;
    }
 }
}
