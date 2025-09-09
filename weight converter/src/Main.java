import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;

        System.out.println("lets convert weight");
        System.out.println("press 1 to convert from lbs to kgs");
        System.out.println("press 2 to convert from kgs to lbs");

        int choice;
        choice = scanner.nextInt();

        if (choice ==1 ){
            System.out.println("enter your weight in pounds");
            weight = scanner.nextDouble();
            newWeight = weight *= 0.453592;
            System.out.println("your weight in kilos will be: "+ newWeight);
        } else if (choice == 2) {
            System.out.println("enter your weight in kilos");
            weight = scanner.nextDouble();
            newWeight = weight *= 2.20462;
            System.out.println("your weight in pounds will be: "+ newWeight);
        }
else {
            System.out.println("invalid input");
    }
scanner.close();
        }}

