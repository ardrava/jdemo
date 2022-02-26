import java.util.*;
import java.io.*;
class FileChar
{
  public static void main (String args [])throws IOException
  {
   int nl=1,nw=0;
   char ch;
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the filename");
   String str=sc.nextLine();

   FileInputStream fin=new FileInputStream (str);
   int n=f.available();
   for(i=0;i<=n;i++)
   {
    ch=(char)f.read();
    if(ch=='\n')
       nl++;
    else
    if(ch=='')
       nw++;
   }
   System.out.println("No.of lines:"+nl);
   System.out.println("No.of words:"+nw);
   System.out.println("No.of characters:"+n);
 }
}
