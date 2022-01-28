import java.util.*;
public class ElementReplace
{
	public static void main(String args[])
  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int size=sc.nextInt();
	    int a[]=new int [size];
	    int x,p;
    
		  System.out.println("Enter the elements in the array");
		  for(int i=0;i<size;i++)
		   {
		      a[i]=sc.nextInt();		   
		   }
		  System.out.println("Elements in the array are:"+Arrays.toString(a));
    
		  System.out.println("Enter the element to replace");
		  x=sc.nextInt();
		  System.out.println("Enter the position to replace");
		  p=sc.nextInt();
		
		  if(p<=size)
		   {
		      int t;
		      t=a[p];
		      a[p]=x;
		      x=t;
		      System.out.println("Elements in the array are:"+Arrays.toString(a));
       }
   }
}


