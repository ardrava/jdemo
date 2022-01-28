import java.util.*;
public class Shapes 
{
    public static void main(String args[])
    { 
      Main ar=new Main();
      ar.area(4);
      ar.area(2,3);
      ar.area(4,5);
    }
  
    void area(double b,double h)
    {
	    System.out.println("Area of triangle:"+(b*h)/2+"sq units");
    }
  
    void area(double a)
    {
      double z=3.14*a*a;
	    System.out.println("Area of the circle :"+z+"sq units");
    }
    
     void area(float a,float b)
    {
	    System.out.println("Area of the rectangle :"+a*b+"sq units");
    }   
}
