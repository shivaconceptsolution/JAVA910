class Marksheet
{
   public static void main(String args[])
   {
        int m1=92,m2=30,m3=85,m4=86,m5=89;
        String sub="";
        if((m1>=0 && m1<=100) && (m2>=0 && m2<=100) && (m3>=0 && m3<=100) && (m4>=0 && m4<=100) && (m5>=0 && m5<=100))
       {
             int c=0;
             String dist="";
             int grace=0;
             if(m1<33)
             {
              c++; 
              sub+=" Physics ";  //sub=sub+"Physics";
              grace=m1;
             }
             if(m2<33)
             {
              c++; 
              sub+=" CHEM ";
              grace=m2;
             }
             if(m3<33)
             {
              c++; 
             sub+=" Maths ";
             grace=m3;
             }
             if(m4<33)
             {
              c++; 
              sub+=" English ";
              grace=m4;
             }

            if(m5<33)
            {
              c++;  
             sub+=" Hindi ";
             grace=m5;
            }
            if(m1>=75)
            dist += " PHYSICS ";
            if(m2>=75)
            dist += " CHEM ";
             if(m3>=75)
            dist += " MATHS ";
            if(m4>=75)
            dist += " ENG ";
            if(m5>=75)
            dist += " HIN ";

           if(c==0 || (c==1 && grace>=28))
           {
                     float per;
                     if(c==0)
                     per = (m1+m2+m3+m4+m5)/5;
                     else
                     per = (m1+m2+m3+m4+m5+(33-grace))/5;
                     if(per>=33 && per<45)
                     System.out.println("Pass by Third Division");
                    else if(per<60)
                    System.out.println("Pass by Second Division");
                   else
                   System.out.println("Pass by First Division");
                   if(dist!="")
                   System.out.println("Distinction Subject name is "+dist);
                   if(c==1)
                   System.out.println("You are pass by grace and grace subject name is "+sub+" grace mark is "+(33-grace));

            }
         else if(c==1)
          {
                  System.out.println("suppl in "+sub);
          } 
        else
          {
                 System.out.println("Fail in "+sub);
          }

     }
    else
    {
         System.out.println("All Subject Marks should be 0 to 100");

    }
       


   }
   


}