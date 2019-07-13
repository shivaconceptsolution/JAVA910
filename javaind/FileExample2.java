import java.io.*;
class FileExample2
{
    public static void main(String args[]) throws IOException
    {
     FileReader f = new FileReader("hello.txt");
    BufferedReader br = new BufferedReader(f);
    String data1="",data="";
     while((data=br.readLine())!=null)
     {
        data1+=data;
     }
      System.out.println(data1);
     f.close();

 
   }



}