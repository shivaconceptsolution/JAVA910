class SwapDemo
{
public static void main(String args[])
{
Object a=10;
int b=20;
a= (int)a+b;
b= (int)a-b;
a=(int)a-b;
System.out.println(a +" "+b);
}
}