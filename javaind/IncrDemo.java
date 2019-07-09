class IncrDemo
{
    public static void main(String args[])
   {
       int a=1,b=2;
       b=a++ + ++a + a++ + ++a + a++;
//    17    1           3      3           5      5    6

       System.out.println(a +" "+ b);
   
   }


}