import java.util.*;
class ExceptionDemo3
{
   
     public static void main(String args[])
     {
      
       try
       {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Number");
        a=sc.nextInt();
        if(a>0)
        System.out.println(a); 
        else
         throw new ArithmeticException();
        
        }
        
        catch(ArithmeticException ex)
        {
          System.out.println("enter positive number");
      
        }
      
        
       }



}