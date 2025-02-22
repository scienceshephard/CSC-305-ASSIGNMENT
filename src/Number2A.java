import java.util.Scanner;

public class Number2A {
    final static int Prayer_a_thon_Record = 144; //144 hours of prayer
    final static int Cook_a_thon_Record = 96; //96 hours of cooking
    final static int Watch_a_thon_Record = 72; //72 hours of watching probably movies
    final static int Soccer_a_thon_Record = 12; //12 hours of playing soccer
    private static String field;
    private static int attemptedRecord;
    final static String msg= "If your new record is based on cooking, type \"cook\". \nIf your new record is based on watching, type \"watch\". \nIf your new record is based on soccer, type \"soccer\". \nIf your new record is based on prayer, type \"prayer\". \n Insert your field record: ";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        while(true){
            field =input.nextLine().trim().toLowerCase();
            if(field.equals("cook")|| field.equals("watch") || field.equals("soccer") || field.equals("prayer")){
                break;
            }else{
                System.out.println("\nThis record is not recognized.\n");
                System.out.println(msg);
            }
        }
        System.out.println("Enter the your attempted record: ");
        try{
            attemptedRecord = input.nextInt();
        }catch(NumberFormatException nfe){
            System.out.println("Invalid response!!!! Please input number.");
        }

        switch (field) {
            case "cook":
                if(attemptedRecord > Cook_a_thon_Record){
                    System.out.printf("Congratulations!!! You have broken the record for Cook-a-thon-Record. Your new record is %d hours\n", attemptedRecord);
                }else{
                    System.out.println("You have not broken the record for Cook-a-thon-Record.");
                }
                break;
            case "watch":
                if(attemptedRecord > Watch_a_thon_Record){
                    System.out.printf("Congratulations!!! You have broken the record for Watch-a-thon-Record. Your new record is %d hours\n", attemptedRecord);
                }else{
                    System.out.println("You have not broken the record for Watch-a-thon-Record.");
                }
                break;
            case "soccer":
                if(attemptedRecord > Soccer_a_thon_Record){
                    System.out.printf("Congratulations!!! You have broken the record for Soccer-a-thon-Record. Your new record is %d hours\n", attemptedRecord);
                }else{
                    System.out.println("You have not broken the record for Soccer-a-thon-Record.");
                }
                break;
            case "prayer":
                if(attemptedRecord > Prayer_a_thon_Record){
                    System.out.printf("Congratulations!!! You have broken the record for Prayer-a-thon-Record. Your new record is %d hours\n1", attemptedRecord);
                }else{
                    System.out.println("You have not broken the record for Prayer-a-thon-Record.");
                }
                break;
        
            default:
                System.out.println("Guess you didn't input anything");
                break;
        }
        input.close();

    }
}
