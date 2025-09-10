import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("lets guess numbers");
        System.out.println("enter min number");
        int min = scanner.nextInt();
        System.out.println("enter max number");
        int max = scanner.nextInt();


        int num;
        int attempts = 0;
        int randomNum = random.nextInt(min,max+1);


        do {
            System.out.println("guess the number");
            num = scanner.nextInt();
            attempts++;

            if (num>randomNum){
                System.out.println("too high");
            } else if (num<randomNum) {
                System.out.println("too low");

            }
            else {
                System.out.printf("you guessed it! its %d, attempts made: %d ",num,attempts);
            }


        } while (num>=min && num<=max && num != randomNum);

        scanner.close();
    }
}