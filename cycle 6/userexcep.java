import java.util.*;

class userexcep 
{
   public static void main(String[] args) 
  {
    try{
        int bal=100;
        if(bal<500)
        {
            throw new lowbalException();
        }
    }
    catch(lowbalException e)
    {
        System.out.println(e);
    }
  }
}
class lowbalException extends Exception
{
      lowbalException()
      {
          System.out.println("Low balance");
      }
  }
