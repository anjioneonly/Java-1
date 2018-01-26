public class Main {
  public static void main(String[] args) {
    int subjectcount = 5;
    int maxmarks=subjectcount * 100;
    int maxattendance = 120;
    int studentcount = 30;
    int[][] studentmarks = new int[studentcount][subjectcount];
    int[]studentattendance = new int [studentcount];
    int ecount = 0;
    
    for(int i = 0; i < studentcount; i++)
    {
      int sum=Getsumofmarks(i,studentmarks,subjectcount);
      float mper=Getpercentage(sum,maxmarks);
      String grade=Getgrade(mper);
      float aper=Getpercentage(studentattendance[i], maxattendance);
      boolean iseligible=iseligible(grade,aper);
      if(iseligible)
        ecount++;
    }
    System.out.println(ecount);
  }
  
  static int Getsumofmarks (int studentindex,int[][] studentmarks,int studentcount)
  {
    int sumofmarks=0;
    for(int i=0;i<studentcount;i++)
    {
      sumofmarks+=studentmarks[studentindex][i];
    }
    return sumofmarks;
  }
  
  static float Getpercentage(int avaragemarks,int totalmarks){
    float per=avaragemarks*100/totalmarks;
    per=Math.Round(per);
    return per;
  }
  
  static String GetGrade(float per)
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
    if(grade == "A" && per >= 60)
      return true;
    if(grade != "D" && per >= 70)
      return true;
    return false;
  }
}
