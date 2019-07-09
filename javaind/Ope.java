class Ope
{
     int a,b,c;
    void add()  //default without return type
   {
      
        a=100;
        b=200;
        c=a+b;
        System.out.println(c);
   }
  int sub()  //default with return type
   {
      
        a=10;
        b=20;
        c=a-b;
        return c;
   }

  public static void main(String args[])
   {
      Ope obj=new Ope();
      obj.add();
      int x = obj.sub();
      System.out.println(x);
  

   }

}


























