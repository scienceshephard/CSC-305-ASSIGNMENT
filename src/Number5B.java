import java.util.Random;

public class Number5B {
    public static void main(String[] args) {
        Random random = new Random();
    
            // Constants
            int totalStudents = 2600;
            int accreditedStudents = 1500;
            int totalRounds = 50;
    
            // Candidates
            String candidate1 = "B.T.A.";
            String candidate2 = "Ben";
    
            int votesForBTA = 0;
            int votesForBen = 0;
    
            // Accreditation Process (Randomly select 1500 students)
            System.out.println("Accreditation Completed! 1,500 students are accredited to vote.");
    
            // Voting Process
            int i=0;
            while (i < accreditedStudents) {
                int btaWins = 0, benWins = 0;
    
                // Simulate 50 rounds of competition for each voter
                for (int j = 0; j < totalRounds; j++) {
                    if (random.nextBoolean()) {
                        btaWins++;
                    } else {
                        benWins++;
                    }
                }
    
                // The candidate who wins more than half of the rounds gets the vote
                if (btaWins > benWins) {
                    votesForBTA++;
                } else {
                    votesForBen++;
                }
                i++;
            }
    
            // Display Final Results
            System.out.println("Election Results:");
            System.out.println(candidate1 + ": " + votesForBTA + " votes");
            System.out.println(candidate2 + ": " + votesForBen + " votes");
    
            // Declare Winner
            System.out.println(" Winner: " + (votesForBTA > votesForBen ? candidate1 : candidate2));
    
            // Footnote for Signatures
            System.out.println(" Faculty Election Verification:");
            System.out.println("Signed by:");
            System.out.println(" - Chairman: Dr. O. G. Aju");
            System.out.println(" - Subdean: Dr. O. O. Ajayi");
            System.out.println(" - Dean: Prof. I. A. Ololade");
    }
}
