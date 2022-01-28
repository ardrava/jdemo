import java.util.*;
public class FrequencyRev 
{
     public static void main(String args[])
     { 
      Main fr=new Main();
      fr.frequency();
      fr.reverse();
     }
  
    void frequency()
    {      
	    System.out.println("Enter a string value :");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

      System.out.println("Enter a particular character :");
      char character = sc.nextLine().charAt(0);
      int count = 0;

      for (int i=0; i<str.length(); i++){
         if(character == str.charAt(i)){
            count++;
         }
      }
      System.out.println("Frequency of the give character: "+count);
    }
  
    void reverse()
    {
      String original, reverse = "";
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a string to reverse");
      original = sc.nextLine();

      int length = original.length();

      for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);

    System.out.println("Reverse of the string: " + reverse);
  }
}
