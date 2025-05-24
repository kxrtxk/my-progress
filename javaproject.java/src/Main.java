package com.kartik;
import java.util.Scanner;
        public class Main{
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String noun;
                String adjective;
                String verb;
                String verb2;
                String noun2;
                System.out.println("enter the place");
                noun = scan.nextLine();
                System.out.println("enter a person or any animal");
                noun2 = scan.nextLine();
                System.out.println("enter a continuous verb");
                verb = scan.nextLine();
                System.out.println("enter a quality");
                adjective= scan.nextLine();
                System.out.println("enter an action");
                verb2=scan.nextLine();


                System.out.print("today i went to " + noun);
                System.out.print(" in " + noun + " i saw " + noun2);
                System.out.print(noun2 + " was " + verb);
                System.out.print(" it was " + adjective);
                System.out.print(" after that, i " + verb2 + " the " + noun);
                scan.close();
            }}