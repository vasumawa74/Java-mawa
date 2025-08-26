package practices;
public class exe3 {
   public static void main(String[] args) {
       
        int score = 75;
        char gradeA = 'A';
        char gradeB = 'B';
        char gradeC = 'C';
        char gradeD = 'D';
        
        if (score>=90)
        {
            System.out.println("Passed");
            System.out.println("Grade: "+gradeA);
        }
        else  if (score>=75 && score<=89)
        {
            System.out.println("Passed");
            System.out.println("Grade: "+gradeB);
        }
        else  if (score>=60 && score<=74)
        {
            System.out.println("Passed");
            System.out.println("Grade: "+gradeC);
        }
        else  if (score>=50 && score<=60)
        {
            System.out.println("Passed");
            System.out.println("Grade: "+gradeD);
        }
        else 
        {
            System.out.println("Failed");
        }
   }
}