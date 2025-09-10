import java.util.Scanner;

public class Main {
   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {


        double balance = 0;
        boolean isTrue = true;
        int action;

    while (isTrue){
        System.out.println("*******************");
        System.out.println("WELCOME TO BIG BANK");
        System.out.println("*******************");
        System.out.println("1. check balance");
        System.out.println("2. deposit");
        System.out.println("3. withdraw");
        System.out.println("4. exit");
        System.out.println("**********");

        System.out.println("select action 1-4");
         action = scan.nextInt();


        switch (action){
            case 1 -> showBalance(balance);
            case 2 -> System.out.println( balance= balance+ deposit());
            case 3 -> System.out.println(balance-= withdraw(balance));
            case 4 -> isTrue=false;
            default -> System.out.println("invalid");



        }
        System.out.println("**************************");
        System.out.println("program ends💹");
        System.out.println("****************");
    }
        scan.close();
    }
    static void showBalance(double balance){
        System.out.println("*************");
        System.out.printf("💲%.2f\n",balance);
    }
    static double deposit(){
        double amount ;
        System.out.println("enter the amount to be deposited");
        amount= scan.nextDouble();
        if (amount<0){
            System.out.println("can't deposit negative");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;
        System.out.println("enter the amount you wanna take out");
        amount= scan.nextDouble();
        if (amount<0){
            System.out.println("you are trying to deposit, go back");
            return 0;
        } else if (amount>balance) {
            System.out.println("isufficient funds");
            return 0;

        } else {
            return amount;
        }
    }
}