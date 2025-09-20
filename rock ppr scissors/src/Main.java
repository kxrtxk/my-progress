import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String [] choices = {"rock","paper","scissor"};
        String playerChoice;
        String computerChoice;
        String play= "yes" ;



        
        do {
            System.out.println("choose. rock/paper/scissor: ");
            playerChoice = scan.nextLine().toLowerCase();
            if (!playerChoice.equals("rock")&&!playerChoice.equals("paper")&&!playerChoice.equals("scissor")){
                System.out.println("invalid");
                continue;

            }
            computerChoice = choices[random.nextInt(0,3)];
            System.out.println("computer choice: "+ computerChoice);
            if (playerChoice.equals(computerChoice)){
                System.out.println("tie");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissor") ||
            playerChoice.equals("paper")&&computerChoice.equals("rock")||playerChoice.equals("scissor")&&computerChoice.equals("paper")) {
                System.out.println("victory");
            }else {
                System.out.println("lost");
            }
            System.out.println("again? yes/no ");
            play = scan.nextLine().toLowerCase();
        } while (play.equals("yes"));


        System.out.println("game ends");





        scan.close();
    }
}