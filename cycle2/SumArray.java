import java.util.*;
public class SumArray
{
	public static void main(String args[]) 
  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int size=sc.nextInt();
	    int a[]=new int [size];
	    int sum=0;
    
		  System.out.println("Enter the elements in the array");
		  for(int i=0;i<size;i++)
		   {
		    a[i]=sc.nextInt();
		    sum=sum+a[i];
		   }
		System.out.println("Elements in the array are:"+Arrays.toString(a));
		System.out.println("Sum the elements in the array"+sum);
	}
}
