class WhileDemo
{
  public static void main(String args[]) throws Exception
  {
    int i=1;
    boolean flag=true;
    while(flag)
     {
           if(i<=5)
           {
            System.out.println(i);
             Thread.sleep(3000);
           }
      
         else
           flag=false;
           i++;
            
     }
       


   }


}