class Student
{
   private int rno;
   private String sname;
    Student()
    {
       rno=1001;
       sname="XYZ";
   }
   Student(int rno,String sname)
   {
       this.rno=rno;
       this.sname=sname;
   }
   Student(Student o)  //copy
   {
       this.rno=o.rno;
       this.sname=o.sname;
   }
   void display()
   {
     System.out.println("Rno is "+rno+" name is "+sname);
   
} 
public static void main(String args[])
{
     Student obj = new Student();
     obj.display();
     Student obj1 = new Student(1002,"mno");
     obj1.display();
     Student obj2 = new Student(obj1);
     obj2.display();
}

}