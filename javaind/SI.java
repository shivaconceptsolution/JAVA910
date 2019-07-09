import java.util.Scanner;
class SI
{
    float calc(float p,float r,float t)
    {
       float si = (p*r*t)/100;
       return si;
   }

   public static void main(String args[])
   {
         Scanner sc = new Scanner(System.in);
         
          float a,b,c;
          System.out.println("enter p");
          a=sc.nextFloat();
          System.out.println("enter r");
          b=sc.nextFloat();
          System.out.println("enter t");
          c=sc.nextFloat();
         SI obj = new SI();
         float r = obj.calc(a,b,c);
         System.out.println(r);
    
   }

}