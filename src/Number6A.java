import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Number6A {

    public static void main(String[] args) {
           // 32 Teams (each as a character array)
            char[][] teams = {
                "Brazil".toCharArray(), "France".toCharArray(), "Germany".toCharArray(), "Argentina".toCharArray(),
                "Spain".toCharArray(), "England".toCharArray(), "Italy".toCharArray(), "Portugal".toCharArray(),
                "Netherlands".toCharArray(), "Uruguay".toCharArray(), "Belgium".toCharArray(), "Croatia".toCharArray(),
                "Denmark".toCharArray(), "Mexico".toCharArray(), "Switzerland".toCharArray(), "Colombia".toCharArray(),
                "USA".toCharArray(), "Japan".toCharArray(), "South Korea".toCharArray(), "Australia".toCharArray(),
                "Senegal".toCharArray(), "Morocco".toCharArray(), "Ghana".toCharArray(), "Nigeria".toCharArray(),
                "Serbia".toCharArray(), "Poland".toCharArray(), "Sweden".toCharArray(), "Chile".toCharArray(),
                "Peru".toCharArray(), "Iran".toCharArray(), "Saudi Arabia".toCharArray(), "Ecuador".toCharArray()
            };

            // Randomly shuffle teams
            shuffleTeams(teams);

            // 8 Groups (A to H), each with 4 teams
            System.out.println("FIFA WORLD CUP DRAW (Alternative Algorithm) ");
            System.out.println("*******************************************************************************************");
            int groupSize = 4;
            for (int i = 0; i < 8; i++) {
                System.out.print("Group " + (char)('A' + i) + ": ");
                for (int j = 0; j < groupSize; j++) {
                    printTeam(teams[i * groupSize + j]);
                    if (j < groupSize - 1) System.out.print(", ");
                }
                System.out.println();
            }

            System.out.println("*******************************************************************************************");
        }

        // Shuffle using Fisher-Yates algorithm
        private static void shuffleTeams(char[][] teams) {
            Random random = new Random();
            for (int i = teams.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                swapTeams(teams, i, j);
            }
        }

        // Swap two teams
        private static void swapTeams(char[][] teams, int i, int j) {
            char[] temp = teams[i];
            teams[i] = teams[j];
            teams[j] = temp;
        }

        // Print team name from character array
        private static void printTeam(char[] team) {
            for (char c : team) {
                if (c == '\0') break;
                System.out.print(c);
            }
            
    }
}