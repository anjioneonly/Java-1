
  public class Main {
  public static void main(String[] args) {
    int subjectcount = 5;
    int maxmarks=subjectcount * 100;
    int maxattendance = 120;
    int studentcount = 10;
    int[][] studentmarks = new int[studentcount][subjectcount];
    int[] studentattendance = new int [studentcount];
    int ecount = 0;

    InitializeAttandance(studentattendance, studentcount, new int[]{90, 73, 100, 115, 72, 40, 65, 80, 75, 60});
    InitializeStudentMarks(studentmarks, 0, subjectcount, new int[]{99, 76, 75, 70, 78});
    InitializeStudentMarks(studentmarks, 1, subjectcount, new int[]{90, 35, 35, 70, 60});
    InitializeStudentMarks(studentmarks, 2, subjectcount, new int[]{95, 35, 35, 70, 60});
    InitializeStudentMarks(studentmarks, 3, subjectcount, new int[]{10, 20, 35, 80, 19});
    InitializeStudentMarks(studentmarks, 4, subjectcount, new int[]{29, 35, 39, 74, 50});
    InitializeStudentMarks(studentmarks, 5, subjectcount, new int[]{80, 45, 34, 70, 60});
    InitializeStudentMarks(studentmarks, 6, subjectcount, new int[]{35, 40, 35, 77, 60});
    InitializeStudentMarks(studentmarks, 7, subjectcount, new int[]{80, 55, 39, 75, 66});
    InitializeStudentMarks(studentmarks, 8, subjectcount, new int[]{57, 76, 44, 66, 70});
    InitializeStudentMarks(studentmarks, 9, subjectcount, new int[]{90, 49, 56, 77, 55});
    for(int i = 0; i < studentcount; i++)
    {
      
      int sum=Getsumofmarks(i,studentmarks,subjectcount);
      float mper= Getpercentage(sum,maxmarks);
      String grade= Getgrade(mper);
      float aper=Getpercentage(studentattendance[i], maxattendance);
      boolean iseligible=iseligible(grade,aper);
      PrintEligibilityAndCriteria(iseligible, grade, aper);
      if(iseligible)
        ecount++;
    }
    System.out.println(ecount);
  }
  
  static void InitializeAttandance(int[] attendance, int studentCount, int[] values)
  {
    for(int i=0; i<studentCount; i++){
      attendance[i] = values[i];
    }
  }
  
  static void InitializeStudentMarks(int[][] studentMarks, int student, int subjectCount, int[] marks)
  {
    for(int i = 0; i < subjectCount; i++){
      studentMarks[student][i] = marks[i];
    }
  }
  
  static int Getsumofmarks (int studentindex,int[][] studentmarks,int subCount)
  {
    int sumofmarks = 0;
    for(int i = 0; i < subCount; i++)
    {
      sumofmarks += studentmarks[studentindex][i];
    }
    return sumofmarks;
  }
  
  static float Getpercentage(int avaragemarks,int totalmarks){
    float per=avaragemarks*100/totalmarks;
    per=Math.round(per);
    return per;
  }
  
  static String Getgrade(float per)
  {
      if(per>=70)
       return "A";
      if(per>=50 && per<70)
       return "B";
      if(per>=35 && per<50)
       return "C";
       return "D";
  }
  
  static boolean iseligible(String grade,float per)
  {
      if(grade == "A" && per >= 60){
        return true;
      }
      if(grade != "D" && per >= 70){
        return true;
      }
      return false;
  }
  
  static boolean iseligibleAndLog(String grade,float per)
  {
      boolean isEligible = (grade == "A" && per >= 60) || (grade != "D" && per >= 70);
      PrintEligibilityAndCriteria(isEligible, grade, per);
      /*if(isEligible)
        eligibilityString = "Yes";
      /*boolean isEligible = false;
      
      if(grade == "A" && per >= 60){
        eligibilityString = "Yes";
        isEligible = true;
      }
      if(grade != "D" && per >= 70){
        eligibilityString = "Yes";
        isEligible = true;
      }*/
      return isEligible;
  }
  static void PrintEligibilityAndCriteria(boolean isEligible, String grade, float percentage)
  {
    String eligibilityString = isEligible ? "Yes" : "No";
   /* System.out.println( " %s "+ eligibilityString   + "Grade: " + 
                          grade + " Attendence percentage: " + percentage);*/
   /* name="eligible";
    name="Grade: ";
    name="Attendance percentage: ";
    stueligible=new eligible(iseligible, Grade, aper );*/
    String PrintableString = String.format("eligible: %1$s grade: %2$s percentage: %3$s", eligibilityString, grade, percentage);
  
    System.out.println( PrintableString );
  }
}

 
