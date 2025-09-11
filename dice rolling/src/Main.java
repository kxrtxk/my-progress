import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int dices;
        int rolls;
        int total = 0;


        System.out.println("enter the no. of dices");
        dices= scan.nextInt();


        if (dices>0){
            for (int i=0;i<dices;i++){
                rolls = random.nextInt(1,7);

                System.out.println("you rolled : "+rolls);
                printDice(rolls);
                total+= rolls;
            }

            System.out.println("your total amounts to: " + total);
        }
        else {
            System.out.println("not valid");
        }
    }
    static void printDice(int rolls){
        String dice1 = """
                _________
               |         |
               |    ●    |
               |         |
                _________
                """;
        String dice2 = """
                _________
               |    ●    |
               |         |
               |    ●    |
                _________
                """;
        String dice3 = """
                _________
               |    ●    |
               |    ●    |
               |    ●    |
                _________
                """;
        String dice4 = """
                _________
               | ●    ●  |
               |         |
               | ●    ●  |
                _________
                """;
        String dice5 = """
                _________
               | ●     ● |
               |    ●    |
               | ●     ● |
                _________
                """;
        String dice6 = """
                _________
               | ●  ●  ● |
               |         |
               | ●  ●  ● |
                _________
                """;
        switch (rolls){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }


    }
}