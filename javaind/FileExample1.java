import java.io.*;
class FileExample1
{
    public static void main(String args[]) throws IOException
    {
     FileWriter f = new FileWriter("hello.txt",true);
     f.write("welcome in abc  ");
     f.close();

 
   }



}