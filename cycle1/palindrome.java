import java.util.*;
class palindrome
{
 public static void main (String args [])
 {
  Scanner sc=new Scanner (System.in);
  String orginal,reverse="";
  System.out.println("Enter the string or number");
  original=sc.nextLine();
  int length=original.length();

  for(int i=length-1;i>=0;i--)
  {
    reverse=reverse+original.charAt(i);
    if(original.equals(reverse))
    {
      System.out.println("Palindrome");
    }
    else
    {
      System.out.println("Not palindrome");
    }
   }
  }
}
