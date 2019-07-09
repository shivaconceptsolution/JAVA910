class StaticDemo
{

     static int x=5;  //static global variable
     public static void main(String args[])
     {
         int x=10;  //static local 
         StaticDemo.x=20;
         x=30;
        System.out.println(x);
        System.out.println(StaticDemo.x);

    }

}