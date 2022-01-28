import java.util.*;
abstract class Geometry 
{
    public static void main(String args[]) 
    {
       Rectangle r = new Rectangle();
       Triangle t = new Triangle();
       Hexagon h = new Hexagon();
       
       r.numberofsides();
       
       h.numberofsides();
       
       t.numberofsides();
       
    }

  public abstract void numberofsides();
}

class Rectangle extends Geometry 
{
  public void numberofsides()
  {
    System.out.println("Number of sides of rectangle=4");
   }
}

class Triangle extends Geometry
{
   public void numberofsides()
   {
     System.out.println("Number of sides of triangle=3");
   }
}

class Hexagon extends Geometry 
{
    public void numberofsides()
    {
      System.out.println("Number of sides of hexagon=6");
    }
    }
