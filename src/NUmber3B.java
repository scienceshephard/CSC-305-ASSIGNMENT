import java.util.Random;

public class NUmber3B {

    public static void main(String[] args) {
        // Define student count per department
        int cscStudents = 125;
        int phyStudents = 82;
        int bchStudents = 133;

        // Allocate questions to each student in all departments
        Questions_Allocation(cscStudents, "CSC" );
        Questions_Allocation( phyStudents, "PHY");
        Questions_Allocation( bchStudents, "BCH");
    }

    static void Questions_Allocation(int studentCount, String course) {
        System.out.println("\n*************************************************");
        System.out.println("  Your Department: " + course);
        System.out.println("*************************************************");

        Random random = new Random();

        for (int No_of_Student = 1; No_of_Student <= studentCount; No_of_Student++) {
            int[] selectedQuestions = new int[50];
            int count = 0;

            while (count < 50) {
                int questionNumber = random.nextInt(1200) + 1; // Range: 1-1200

                // Check for duplicates manually
                boolean exists = false;
                for (int i = 0; i < count; i++) {
                    if (selectedQuestions[i] == questionNumber) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    selectedQuestions[count] = questionNumber;
                    count++;
                }
            }

            System.out.println("\n"+ No_of_Student + " "  + course + " students:");
            System.out.print("Question numbers to be answered: ");
            for (int i = 0; i < 50; i++) {
                System.out.print(selectedQuestions[i] + (i < 50 - 1 ? ", " : "\n"));
            }
        }
    }   
}