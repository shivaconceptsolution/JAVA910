class StaticBlock
{
   static int a,b;
   static
   {
       a=100;
       b=200;
   }
  static
   {
       a=10;
       b=20;
   }
  static void display()
  {
     System.out.println(a+b);

  }    
   
  public static void main(String args[])
  {
      display();
   }

}