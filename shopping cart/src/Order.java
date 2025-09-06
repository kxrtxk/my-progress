import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item ;
        System.out.println("enter your order:");
        item = sc.nextLine();
        System.out.println(item);
        double price ;
        System.out.println("enter the price");
        price=sc.nextInt();
        System.out.println(price);
        int qty;
        System.out.println("how many?");
        qty= sc.nextInt();
        System.out.println(qty);
        double total = price*qty;
        System.out.println("your total will be "+"$"+total);
sc.close();
    }}
