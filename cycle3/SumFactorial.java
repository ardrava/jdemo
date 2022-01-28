import java.util.*;
public class SumFactorial 
{
     public static void main(String args[])
     { 
       Main fs=new Main();
       fs.factorial();
       fs.sum();
     }
  
    void factorial()
    {      
	    Scanner sc=new Scanner(System.in);
      int t1=0,t2=1;
		  System.out.println("Enter the number");
		  int n=sc.nextInt();
		  int i=1,fact=1;
		  
      while(i<=n)
        {
            fact=fact*i;
            i++;
        }
      System.out.println("Factorial of entered number:"+fact);
    }
  
    void sum()
    {
      Scanner sc = new Scanner(System.in);
		  System.out.print("Enter number : ");
		  int n = sc.nextInt();
		  int total=0;
		  int i=1;
      
		  while(i <= n) 
		   {
			      int factorial=1;
			      int j=1;
			
			while(j <= i) 
			 {
				    factorial=factorial*j;
				    j = j+1;
			 }
			total = total + factorial;
			i=i+1;
		}
		System.out.println("Sum : " + total);
	}
}
