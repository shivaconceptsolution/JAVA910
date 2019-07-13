import java.util.*;
class ExceptionDemo2
{
   
     public static void main(String args[])
     {
       String str="";
       try
       {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter First Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        c=a/b;
        System.out.println(c); 
         str="Program Executed Successfully";
        }
        catch(InputMismatchException ex)
        {
          System.out.println("enter only numeric value");
         str="Program NOT Executed Successfully";
        }
        catch(ArithmeticException ex)
        {
          System.out.println("denominator should not be zero");
        str="Program NOT Executed Successfully";
        }
       finally
       {
         System.out.println(str);
       }
 
        
       }



}