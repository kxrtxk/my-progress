import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 ;
        double number2 ;
        char operator;
        double result = 0;
        

        System.out.print("enter first number: ");
        number1 = scanner.nextDouble();
        System.out.print("enter the operator- +,-,*,/,^: ");
        operator = scanner.next().charAt(0);
        System.out.println("enter the second number");
        number2 = scanner.nextDouble();

        switch (operator){
            case '+' -> result= number1 + number2  ;
            case '-' -> result= number1 - number2 ;
            case '*' -> result= number1*number2 ;
            case '/' -> {
                if (number1==0 || number2 == 0) {
                    System.out.println("cannot divide by zero");
                }
            else{ result=number1/number2 ; }}
            case '^' ->  result=Math.pow(number1,number2) ;
            default -> System.out.println("invalid");


        }
        System.out.println(result);





        scanner.close();
    }
}