class Addition
{
   void add(int x,int y)
   {
       System.out.println(x+y);
   }
   void add(int x,float y)
   {
    System.out.println(x+y);
   }
   void add(float x,int y)
   {
   System.out.println(x+y);
   }
    void add(double x,int y)
   {
   System.out.println(x+y);
   }
   void add(float x,float y)
   {
    System.out.println(x+y);
   }

   public static void main(String args[])
   {
      Addition obj = new Addition();
      obj.add(100.2,200.2);
   }

}