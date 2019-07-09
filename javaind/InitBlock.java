class InitBlock
{
 int a=2;
 int b=2;
static
{
   System.out.println("static");
}
InitBlock()
  {
     System.out.println("Constructor");
     a=1;
     b=2;
     
  } 
 {
        System.out.println("Intializer1");
        a=3;
        b=4;
 }
 {
        System.out.println("Intializer2");
       
 }
 void display()
  {
     System.out.println(a+b);
  } 
  
public static void main(String args[])
  {
       InitBlock obj = new InitBlock();
      // obj.display(); 
 }

}
