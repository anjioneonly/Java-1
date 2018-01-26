public class Main {
  public static void main(String[] args) {
    int SubjectCount=5;
    
    int maxmarks=SubjectCount*100;
    int maxattendance=120;
    int studentcount=10;
    int[][]studentmarks = new int[studentcount][SubjectCount];
    int[]studentattendance = new int[studentcount];
    
    studentattendance[0] = 90;
    studentattendance[1] = 73;
    studentattendance[2] = 100;
    studentattendance[3] = 115;
    studentattendance[4] = 72;
    studentattendance[5] = 40;
    studentattendance[6] = 65;
    studentattendance[7] = 80;
    studentattendance[8] = 75;
    studentattendance[9] = 60;
    
    studentmarks[0][0] = 99;
    studentmarks[0][1] = 76;
    studentmarks[0][2] = 75;
    studentmarks[0][3] = 70;
    studentmarks[0][4] = 78;
    
    studentmarks[1][0] = 90;
    studentmarks[1][1] = 35;
    studentmarks[1][2] = 35;
    studentmarks[1][3] = 70;
    studentmarks[1][4] = 60;
    
    
    studentmarks[2][0] = 95;
    studentmarks[2][1] = 35;
    studentmarks[2][2] = 35;
    studentmarks[2][3] = 70;
    studentmarks[2][4] = 60;
    
    
    studentmarks[3][0] = 90;
    studentmarks[3][1] = 20;
    studentmarks[3][2] = 35;
    studentmarks[3][3] = 80;
    studentmarks[3][4] = 19;
    
    
    studentmarks[4][0] = 29;
    studentmarks[4][1] = 35;
    studentmarks[4][2] = 39;
    studentmarks[4][3] = 74;
    studentmarks[4][4] = 50;
    
    
    studentmarks[5][0] = 80;
    studentmarks[5][1] = 45;
    studentmarks[5][2] = 34;
    studentmarks[5][3] = 70;
    studentmarks[5][4] = 60;
    
    
    studentmarks[6][0] = 35;
    studentmarks[6][1] = 40;
    studentmarks[6][2] = 35;
    studentmarks[6][3] = 77;
    studentmarks[6][4] = 60;
    
    
    studentmarks[7][0] = 80;
    studentmarks[7][1] = 55;
    studentmarks[7][2] = 39;
    studentmarks[7][3] = 75;
    studentmarks[7][4] = 66;
    
    
    studentmarks[8][0] = 57;
    studentmarks[8][1] = 76;
    studentmarks[8][2] = 44;
    studentmarks[8][3] = 66;
    studentmarks[8][4] = 70;
    
    studentmarks[9][0] = 90;
    studentmarks[9][1] = 49;
    studentmarks[9][2] = 56;
    studentmarks[9][3] = 77;
    studentmarks[9][4] = 55;
    

    
    int ecount=0;
    for(int i=0;i<studentcount;i++){
      int sumofmarks=0;
      for(int j=0;j<SubjectCount;j++){
        sumofmarks+=studentmarks[i][j];
      }
      float mper=sumofmarks*100/maxmarks;
      String grade=" ";
      if(mper>=70){
        grade ="A";
        
      }
      else if(mper>=50 && mper<70){
        grade ="B";
      }
      else if(mper>=35 && mper<50){
        grade ="C";
         
      }
      else {
        grade ="D";
        
      }  
      float aper= studentattendance[i]*100/ maxattendance;
       
      boolean IsEligible=false;
      String n="";
      if(grade =="A" && aper>=60){
        IsEligible=true; n="yes";
      }
      if(grade !="D" && aper>=70){
        IsEligible =true; n="yes";
      }
      else n="no";
      System.out.println("Eligible:" +n+ "student grade=" +grade+ "student attendence percentage="+aper);
      if(IsEligible){
       ecount++;
      }
    }
    
    System.out.println(ecount++ + " ");
  }
}