import java.util.Scanner;
class CheckDivide
{
   public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
       System.out.println("enter third number");
        int num3=sc.nextInt();
      
        switch(num1/num2)
       {
            case 0:
            switch(num2/num3)
            {
             case 0:
             System.out.println("num3 is greater");
             break;
             default:
             System.out.println("num2 is greater");
             break;
            }
            break;
            default:
            switch(num1/num3)
            {
             case 0:
             System.out.println("num3 is greater");
             break;
             default:
             System.out.println("num1 is greater");
             break;
            }
          


       }
 

   }

   

}