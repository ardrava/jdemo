import java.util.*;
public class SearchChar
{
	public static void main(String args[]) 
  {
	    Scanner sc=new Scanner(System.in);
	    int i,n,flag=0;
    
	    System.out.println("Enter the string");
	    String s=sc.nextLine();
	    n=s.length();
	    char ch;
    
		  System.out.println("Enter the charecter to be searched");
		  ch=sc.next().charAt(0);
		  for(i=0;i<n;i++)
		   {
		     if(s.charAt(i)==ch)
		     {
		         flag=1;
		         break;
		     }
		  }
		  if(flag==0)
		  {
		    System.out.println("The charecter not present in"+s);  
		  }
		else
		  {
		    System.out.println("The charecter "+ch+"is present in"+s+"at position"+(i+1)); 
	    }	
   }
}
