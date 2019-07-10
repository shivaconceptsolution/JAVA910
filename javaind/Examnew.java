class Exam
{
    void examDuration()
    {
         System.out.println("three hours");
    }
   void examPattern()
   {
       System.out.println("number system");
   } 

}

class Examnew extends Exam
{
      void examPattern()
   {
       System.out.println("grade system");
   } 

  public static void main(String args[])
  {
      Exam obj = new Examnew();
      obj.examDuration();
      obj.examPattern();
  }
}
