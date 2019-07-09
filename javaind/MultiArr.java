import java.util.Scanner;
class MultiArr
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
    // int arr[][]= {{2,3},{4,5},{4,7}};  //static data
   int r,c;
   System.out.println("enter row");
   r=sc.nextInt();
  System.out.println("enter column");
  c=sc.nextInt();

int arr[][] = new int[r][c];
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
      System.out.println("enter array element for "+i+j+" index");
      arr[i][j]= sc.nextInt();
    }
    System.out.println(); 

}
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        System.out.print(arr[i][j]+" ");
    }
    System.out.println(); 

}


   }

}