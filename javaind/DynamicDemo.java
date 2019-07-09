class DynamicDemo
{

      int x=5;  //dynamic global variable
      
      void display()
      {
           x=20;
          int x=10; //local
             x=100;
          System.out.println(x);

      }
     public static void main(String args[])
     {
        DynamicDemo obj;  //reference in stack
        obj= new DynamicDemo() ;  //allocate  memory at heap
        obj.display();  
        System.out.println(obj.x);
       DynamicDemo obj1;  //reference in stack
        obj1= new DynamicDemo() ;  //allocate  memory at heap
        obj1.x=200;
        obj1.display();
        System.out.println(obj1.x);
    }

}