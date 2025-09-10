import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double temp;
        double newTemp ;
        String unit;


        System.out.println("enter temperature");
        temp = scan.nextDouble();

        System.out.println("change to C(celsius) or F(fahrenheit)");
        unit = scan.next().toUpperCase();

        newTemp = (unit.equals("C"))? (temp*9/5)+32: (temp-32)*5/9;



        System.out.printf("%.2f°%s", newTemp,unit);


        scan.close();
    }
}