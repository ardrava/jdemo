import java.util.Arrays;
import java.util.Scanner;

class arrayout 
{
   public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array");
	    int size=sc.nextInt();
	    int a[]=new int [size];
	    int sum=0;
		  
     System.out.println("Enter the elements in the array");
		 for(int i=0;i<size;i++)
		  {
		    a[i]=sc.nextInt();
	  	}
     System.out.println("Elements in the array are: ");
     System.out.println(Arrays.toString(a));
     System.out.println("Enter the index of the required element ::");
     int element = sc.nextInt();
     System.out.println("Element in the given index is :: "+a[size]);
   }
}


