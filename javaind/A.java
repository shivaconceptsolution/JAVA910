class A
{ 
   int a;
   A()
   {
     a=10;
     System.out.println(a);
   }
   A(int a)
   {
     this.a=a;
     System.out.println(a);
   }
   A(A o)
   {
      System.out.println(o.a);
   } 

   public static void main(String args[])
   {
     A obj = new A();  //a=10   
     A obj2 = new A(20);  //a=10   
       
     A obj1 = new A(obj);  //a=10
   }
}

