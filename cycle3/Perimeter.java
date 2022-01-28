import java.util.*;
public class Peri 
{
     public static void main(String args[])
     {
         perimeter pm=new perimeter(4,5);
         perimeter pmc=new perimeter(3);
     }
}
class perimeter
{
      perimeter(float l, float b)
        {
            System.out.println("Perimeter of the rectangle"+(l+b)*2);
        }
      perimeter(double r)
        {
            double z=2*3.14*r;
            System.out.println("Perimeter of the circle"+z);
        }
    }

