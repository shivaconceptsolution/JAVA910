import java.util.Scanner;
class ArrExample
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter size of array");
      int size=sc.nextInt(); 
      float arr[] = new float[size];
      for(int i=0;i<size;i++)
      {
           System.out.println("enter element for "+ i + " index");
           arr[i]=sc.nextFloat();
      }
     for(int i=0;i<size;i++)
    {
         System.out.println(arr[i]);
    }
      


   }



}