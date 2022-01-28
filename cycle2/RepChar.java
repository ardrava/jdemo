import java.util.*;
public class RepChar
{
	public static void main(String args[]) 
  {
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter the string");
	    String s=sc.nextLine();
	    char ch,rp;
    
		  System.out.println("Enter which letter to be replaced");
		  ch=sc.next().charAt(0);
		  System.out.println("Enter letter to be replaced");
	    rp=sc.next().charAt(0);
	    s=s.replace(ch,rp);
      System.out.println("Replaced string"+s);
  }
}
