import java.util.*;
public class LargestElement
{
     public static void main(String args[]) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the matrix");
	    int size=sc.nextInt();
	    int a[][]=new int [size][size];
	    int i,j;
            
	    System.out.println("Enter the elements in the matrix");
	    for(i=0;i<size;i++)
	     {
	       for(j=0;j<size;j++)
		 {
		    a[i][j]=sc.nextInt();
	         }
	     }
	     
	    int largest=a[0][0];
	    for( i=0;i<size;i++)
	     {
		for(j=0;j<size;j++)
		 {
	            if(largest<a[i][j])
	              {
		          largest=a[i][j];
		      }
		 }
	      }
	    System.out.println("Largest element"+largest);
	}
}
