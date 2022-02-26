import java.io.*;
import java.util.*;
class LineNumber
{
  public static void main (String args [])throws IOException
  {
    FileInputStream fin=new FileInputStream ("e.txt");
    int i=1;
    int ch;
    System.out.println(i+"_");
    while ((ch=fin.read())!=-1)
    {
      System.out.println((char)ch);
      if(ch=='\n')
        System.out.println(++i+"_");
     }
    fin.close();
   }
}
