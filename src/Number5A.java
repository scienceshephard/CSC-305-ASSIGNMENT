
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Number5A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random =new Random();
        int wrong_turns = 0;
        int total_cities=12;
        int[] cities = new int[total_cities];
        for(int i = 0; i < total_cities; i++){
            cities[i] = random.nextInt(2);
        }

        int city = 0;
        while (city < total_cities) {

        System.out.print("Welcome to our island!!!\n To know whether you are on the right path to the city you want to go to, I will have consult my divine coin. But you will play a part. You will select between 0 and 1 to decide your way.\n 0 means Tails and 1 means Head: ");
        int userChoice = 0;
        while (true) {
            try{
                userChoice = input.nextInt();
                if(userChoice == 0 || userChoice == 1){
                    break;
                }
            }catch(InputMismatchException ime){
                System.out.println("Unrecognized reponse. \n Remember you will select between 0 and 1 to decide your way.\n 0 means Tails and 1 means Head: ");
                input.next();
            }
        }
            if (userChoice == cities[city]) {
                System.out.println( "You are on the right path! Continue your journey along the path\n");
                break;
            } else {
                wrong_turns++;
                System.out.println("You took the wrong path.\nIf you don't want to consult my divine coin again type 'n': ");
                char choice = input.next().charAt(0);
                if (choice == 'n') {
                    System.out.println("You have decided to end your journey. You took " + wrong_turns + " wrong turns.");
                    break;
                }
            }
            if (wrong_turns >= 5) {
                System.out.println("You have taken 3 wrong turns. You have failed to find the right path. You have failed the game.");
                break;
                
            }

        }

    }
}
