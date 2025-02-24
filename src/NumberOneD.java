import java.util.Scanner;

public class NumberOneD {

    //predicts the current grade of a student based on their previous performance.
    private static double predictGrade(double score){
        final double gradeValuation = 5.0; //Grade evaluation.

        return score - (score * gradeValuation/100);
    }
    public static void main(String[] args) {
        
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 3 of your 200 level 2nd semester courses grades.\nFirst course:");
        double First200lvlCourseGrade = scn.nextDouble();
        
        System.out.print("\nSecond course: ");
        double Second200lvlCourseGrade = scn.nextDouble();
        
        System.out.print("\nThird course:");
        double Third200lvlCourseGrade = scn.nextDouble();
        
        double Predicted_300_lvl_First_Grade = predictGrade(First200lvlCourseGrade);
        double Predicted_300_lvl_Second_Grade = predictGrade(Second200lvlCourseGrade);
        double Predicted_300_lvl_Third_Grade = predictGrade(Third200lvlCourseGrade);
        System.out.println("\nThese are the grade you will likey get for 300-level 1st semester:");
        System.out.printf("First course: %.2f\n", Predicted_300_lvl_First_Grade);
        System.out.printf("Second course: %.2f\n", Predicted_300_lvl_Second_Grade);
        System.out.printf("Third course: %.2f\n", Predicted_300_lvl_Third_Grade);

    }
    
}
