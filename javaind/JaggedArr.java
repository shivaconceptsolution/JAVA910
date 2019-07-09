import java.util.Scanner;
class JaggedArr
{
    public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       int r,c;
       System.out.println("enter number of rows for array");
       r=sc.nextInt();
       int arr[][] = new int[r][];
     
     
       for(int i=0;i<r;i++)
       {
            System.out.println("enter column element for row index "+i);
            c=sc.nextInt();  
            arr[i] = new int[c];
            for(int j=0;j<arr[i].length;j++)
            {
                   System.out.println("enter element for "+i + j+ " index");
                   arr[i][j]=sc.nextInt();

            }
       }
      for(int i=0;i<r	;i++)
       {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
     }
       


   }


}