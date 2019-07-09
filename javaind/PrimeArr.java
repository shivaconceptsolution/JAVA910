import java.util.Scanner;
class PrimeArr
{
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i,j;
        for(i=0;i<size;i++)
        {
          System.out.println("enter element for "+ i +" index");
          arr[i]=sc.nextInt();
        }
      for(i=0;i<size;i++)
      {
        int c=0;
         for(j=1;j<=arr[i];j++)
         {
                      if(arr[i]%j==0)
                       {
                          c++;
                          break;
                       }
         }
         if(c==2)
         System.out.println(arr[i]);

      }
      


   }


}