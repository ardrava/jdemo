import java.io.*;
import java.util.*;
class filewrite
{
 public static void main (String args [])throws IOException
 {
  try{
    Scanner sc=new Scanner (System.in);
    FileWriter fw=new FileWriter ("e1.txt");
    System.out.println("Enter your name");
    String name=sc.nextLine();
    System.out.println("Enter your address");
    String address=sc.nextLine();
    
    fw.write(name);
    fw.write(address);
    fw.close();

    FileReader fr=new FileReader ("e1.txt");
    int ch;
    while ((ch=fr.read())=-1)
    {
      System.out.println((char)ch);
      fr.close();
    }
   }catch(Exception e)
    {
     System.out.println(e);
    }
  }
}
