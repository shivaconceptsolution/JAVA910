class CheckVC
{
   public static void main(String args[])
   {
       char ch;
       ch='f';
       String s = (ch=='y' )?"yes":(ch=='n'?"NO":(ch=='c')?"cancel":"");
     System.out.println(s);


   }

}