import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int payout;
        int balance = 100;
        int bet;
        String[] rows;
        String playAgain;

        System.out.println("java slot machine");
        System.out.println("symbols (🪙💸💵💰🏦)");
        System.out.println("+++++++++++++++++++++++++");

        while (balance>0){
            System.out.println("Current balance: $" + balance);
            System.out.println("enter the bet");
            bet = scan.nextInt();
            scan.nextLine();

            if (bet==0){
                System.out.println("cant bet nothing");
                continue;
            } else if (bet>balance) {
                System.out.println("bet exceeds balance");
                continue;

            }
            else {

                balance -= bet ;

            }
            System.out.println("spinnng...");
            rows = spinRow();
            printRow(rows);
           payout= getPayout(rows,bet);
           if (payout>0){
               System.out.println("you won $"+ payout);
               balance += payout;

           }else {
               System.out.println("sorry, round lost!");
           }
            System.out.println(" play again? Y/N");
           playAgain = scan.nextLine().toUpperCase();
           if (!playAgain.equals("Y")){

               break;
           }

        } System.out.println("game over! final balance = $"+ balance);

        scan.close();



    } public static  String[] spinRow(){
        String [] symbols = {"🪙","💸","💵","💰","🏦"};
        String [] rows = new String[3];
        Random random = new Random();
        for (int i = 0;i<3;i++){
            rows[i] = symbols[random.nextInt(symbols.length)];
        }
        System.out.println(rows[0]+rows[1]+rows[2]);
        return rows;
}
        static void printRow(String[] rows){
            System.out.println("++++++++++++++++++++++++");
            System.out.println(" "+ String.join(" | ",rows));
            System.out.println("++++++++++++++++++++++++");
        }
        static int getPayout(String[] rows,int bet){
        if (rows[0].equals(rows[1]) && rows[1].equals(rows[2])){
            return switch (rows[0]){
                case "🪙" -> bet *3;
                case "💸" -> bet *4;
                case "💵" -> bet * 5;
                case "💰" -> bet * 10;
                case "🏦" -> bet  * 20;
                default -> 0;

            };


        }
        else if (rows[0].equals(rows[1])){
                return switch (rows[0]){
                    case "🪙" -> bet *2;
                    case "💸" -> bet *3;
                    case "💵" -> bet * 4;
                    case "💰" -> bet * 5;
                    case "🏦" -> bet  * 10;
                    default -> 0;

                };}   else if (rows[1].equals(rows[2])){
            return switch (rows[1]){
                case "🪙" -> bet *2;
                case "💸" -> bet *3;
                case "💵" -> bet * 4;
                case "💰" -> bet * 5;
                case "🏦" -> bet  * 10;
                default -> 0;

            };}

return 0;
}}