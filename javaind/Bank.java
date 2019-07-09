class Bank
{
    int amt=5000;
    public void login(int pin)
    {
         if(pin==123)
          {
               credit(5000);
          }
        else
        System.out.println("invalid pin code");
    }
    private void credit(int bal)
    {
       amt+=bal;
       System.out.println(amt);
    }  
   private void debit(int bal)
    {
      amt-=bal;
      System.out.println(amt); 
    }  
     
   

}

class User
{
    public static void main(String args[])
    {
       Bank obj = new Bank();
       obj.login(123);
    }

}