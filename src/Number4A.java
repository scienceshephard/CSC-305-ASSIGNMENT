import java.util.Random;

public class Number4A {

    final static int Numbers_Of_Throws=25;
    static final int Numbers_Of_Players=4;
    public static void main(String[] args) {
        Random randomDice = new Random();
        int[] players= new int[Numbers_Of_Players];

        int player=0;
        while(player < Numbers_Of_Players){
            int total=0;
            int throwDice=0;
            do{
                int firstDie = randomDice.nextInt(6) + 1;
                int secondDie = randomDice.nextInt(6) + 1;
                total = total + (firstDie+secondDie);
                throwDice++;
            }while(throwDice < Numbers_Of_Throws);
            players[player] = total;
            System.out.printf("Player%d total score is: %d", (player + 1), total);
            int[] rankings = rankingPlayers(players);

        // Displays the results
        System.out.println("\n LUDO GAME RESULTS");
        System.out.println("Winner: Player " + (rankings[0] + 1) + " (Score: " + players[rankings[0]] + ")");
        System.out.println("1st Runner-up: Player " + (rankings[1] + 1) + " (Score: " + players[rankings[1]] + ")");
        System.out.println("2nd Runner-up: Player " + (rankings[2] + 1) + " (Score: " + players[rankings[2]] + ")");
        System.out.println("Loser: Player " + (rankings[3] + 1) + " (Score: " + players[rankings[3]] + ")");
    }

        
    }

    private static int[] rankingPlayers(int[] scores) {
        int[] rankings = {0, 1, 2, 3}; 
        for (int i = 0; i < Numbers_Of_Players - 1; i++) {
            for (int j = i + 1; j < Numbers_Of_Players; j++) {
                if (scores[rankings[i]] < scores[rankings[j]]) {
                    // Swap rankings
                    int a = rankings[i];
                    rankings[i] = rankings[j];
                    rankings[j] = a;
                }
            }
        }
        return rankings;}
}
