import java.util.Scanner;
class StudentInfo
{
    static String collegename;
    String rno;
    String branch;
   Scanner sc = new Scanner(System.in);
    static void collegeInfo()  //static member function
    {
      collegename="GSITS";
      System.out.println(collegename);
    }
   void stuInfo()  
   {
       System.out.println("enter rno");
       rno=sc.next();
        System.out.println("enter branch");
       branch =sc.next(); 
      System.out.println("rno is "+rno+" branch is "+branch);
   } 
    
public static void main(String args[])
{
    StudentInfo.collegeInfo();
    StudentInfo obj = new StudentInfo();
    obj.stuInfo();
    StudentInfo obj1 = new StudentInfo();
    obj1.stuInfo();

}

}