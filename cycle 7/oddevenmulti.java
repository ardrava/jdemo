class odd extends Thread
{
 public void run()
 {
  try{
   System.out.println("Display odd numbers between 1 and 100");
   for(int i=0;i<=100;i++)
   if(1%2!=0)
    {
     System.out.println(i);
    }
   catch(Exception e)
    {
      System.out.println(e);
    }
   }
  }
  
class even extends Thread
{
 public void run()
 {
  try{
   System.out.println("Display even numbers between 1 and 100");
   for(int i=0;i<=100;i++)
   if(1%2==0)
    {
      System.out.println(i);
    }
   catch(Exception e)
    {
      System.out.println(e);
    }
   }
  }
  
  class oddevenmulti
  {
   public static void main(String args[])throws Exception
   {
     try{
       odd o=new odd();
       even e=new even();
       o.start();
       o.join();
       e.start();
       
     }
      catch(Exception e)
      {
      System.out.println(e);
      }
    }
}
  
