import java.util.*;
class ExceptionDemo4
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
         throw new NegativeException();
        
        }
        
        catch(NegativeException ex)
        {
          System.out.println(ex.getMessage());
      
        }
      
        
       }



}

class NegativeException extends RuntimeException
{
    public String getMessage()
     {
        return "enter positive number";
     }

}