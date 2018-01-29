public class Main{
    public static void main(String[] args){
        // maximum subjects in this class
        int subjectCount = 5;
        // maximum marks for the class
        int maxMarks = 100 * subjectCount;
        // number of students in the class
        int studentCount = 10;
        //student marks in the class
        int [][]studentMarks= new int[studentCount][subjectCount];
        //student caste in the class
        String[]caste =new String[studentCount];
        //student parents income
        int[]income=new int[studentCount];
        //ecount=0;
    }

    static int Getsumofmarks(int studentIndex,int[][] studentMarks,int subjectCount){
        int sumofmarks;
        for(int stu = 0; stu < studentCount; stu++){
           sumofmarks = 0;
            for(int sub = 0; sub < subjectCount; sub++){
                sumofmarks += studentMarks;
            }
        }
        return sumofmarks;
    }
       
    static float GetmarksPercentage(int sumofmarks,int maxMarks){
        Percentage = sumofmarks*100/ maxMarks;
        Percentage=Math.around(Percentage);
        return Percentage;
    } 

    static boolean isEligible(float percentage, String caste, int income){ 
        // all are eligible when percentage is more than 90
        if (percentage >= 90){
            return true;
        }
        // sc, st, bc are eligible when percentage is between 80 and 90
        // oc are eligible when income is below 10 lakhs and percentage is between 80 and 90
        if(percentage >= 80){
            if(caste == "SC" || caste == "ST" || caste == "BC"){
                return true;
            }
            if(caste == "OC" && income <= 1000000){
                return true;
            }
            else{
                return false;
            }
        }
        // sc, st are eligible when percentage is between 70 and 80
        // bc is eligible when income is below 10 lakhs and percentage is between 70 and 80
        // oc is not eligible
        else if(percentage >= 70){
            if(caste == "SC" || caste == "ST"){
                return true;
            }
            else if(caste == "BC" && income <= 1000000){
                return true;
            }
            else{
                return false;
            }
        }
        // st are eligible when percentage is between 60 and 70
        // sc is eligible when income is below 15 lakhs and percentage is between 60 and 70
        // bc is eligible when income is below 5 lakhs and percentage is between 60 and 70
        else if(percentage>=60){
             if(caste == "ST" ){
                 return true;
             }
             else if(caste == "SC" && income > 1500000){
                 return true;
             }
             else if(caste == "BC" && income > 500000){
                 return true;
             }
             else{
                 return false;
             } 
        }
        // st is eligible when percentage is between 50 and 60
        // sc is eligible when percentage is between 50 and 60 and income is below 1000000
        else if(percentage >=50){
            if(caste == "ST" ){
                return true;
            }
            else if(caste == "SC" && income > 1000000){
                return true;
            }
            else{
                return false;
            }
        }
        // st is eligible when percentage is between 40 and 50 and income below 2000000
        // sc is eligible when percentage is between 40 and 50 and income below 500000
        else if(percentage >= 40){
            if(caste == "ST" && income > 2000000){
                return true;
            }
            else if(caste == "SC" && income > 500000){
                return true;
            }
            else{
                return false;
            }

        }
        // st is eligible when percentage is between 35 and 40 and income is below 1000000
        else if(percentage >=35){
            if(caste == "ST" && income > 1000000){
                return true;
            }
            else{
                return false;
            }

        }
        return false;
    }

    static void printEligibilityAndCriteria(boolean isEligible, String caste, float percentage){
      String eligibilityString = isEligible ? "Yes" : "No";
      String Printablestring = String.format("Eligibility: %1$s caste: %2$s percentage: %3$s ", eligibilityString, caste, percentage);
      System.out.println( Printablestring);
    }
  }
 
