import java.util.*;
class armstrong
{
 public static void main (String args [])
 {
  Scanner sc=new Scanner (System.in);
  int a,n,arm=0,temp;
  System.out.println("Enter the number");
  n=sc.nextInt();
  temp=n;
 
  for(;n!=0;n/=10)
   {
     a=n%10;
     arm=arm+(a*a*a);
   }
  if(arm==temp)
   {
     System.out.println(temp+"is an amstrong");
   }
  else
   {
     System.out.println(temp+"is not amstrong");
   }
 }
}
