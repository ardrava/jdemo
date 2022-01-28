import java.util.*;
public class LargestElement
{
	public static void main(String args[]) 
  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int size=sc.nextInt();
	    int a[]=new int [size];
	    
		  System.out.println("Enter the elements in the array");
		  for(int i=0;i<size;i++)
		   {
		      a[i]=sc.nextInt();
		   }
    
		  int largest=a[0];
		  for(int i=0;i<size;i++)
		    if(largest<a[i])
		     {
		         largest=a[i];
		     }
		  System.out.println("Elements in the array are:"+Arrays.toString(a));
		  System.out.println("Largest element"+largest);
	}
}
