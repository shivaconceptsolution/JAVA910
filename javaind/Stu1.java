abstract class Stu
{
    abstract public void fun1();
    void fun2()
    {
       System.out.println("Fun2");
    }

}

class Stu1 extends Stu
{
      public void fun1()
      {
           System.out.println("Fun1");
      }

     public static void main(String args[])
     {
        Stu obj = new Stu1();
        obj.fun1();
        obj.fun2();
        
     }
}