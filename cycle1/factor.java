import java.util.*;
class factor
{
 public static void main (String args [])
 {
   Scanner sc=new Scanner (System.in);
   int n,i,count=0;
   System.out.println("Enter the number");
   n=sc.nextInt();
   
   for(i=1;i<=n;i++)
    {
     if(n%i==0)
      count++;
    }
   System.out.println("The factor of"+n"is"+count);
 }
}
   
