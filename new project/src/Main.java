import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String[] questions = {"what is the fullform of pc? " ,"who invented a computer? ",
                "what is called the brain of a pc? ",
                "WHICH OF these is an input device? ","which of these is an output device? "};

            String[][] options = {{"1.personal computer ","2.personal caterer ","3.pet cat "},
                    {"1.charles babbage ","2.nikola tesla ", "3.hubert victoria " },
                    {"1.CPU ","2.UPS ","3.USB "},{"1.monitor ","2.keyboard ","3.printer"},
                    {"1.mouse ","2.keyboard ","3.printer "}};
            int[] answers = {1,1,1,2,3};
            int guess;
            int score=0;

        System.out.println("WELCOME TO THE QUIZ!!");

            for (int i=0;i< questions.length;i++){
                System.out.println(questions[i]);
                for (String option:options[i]){
                    System.out.println(option);
                }
                System.out.println("choose the answer:");
                guess = scan.nextInt();
                if (guess==answers[i]){
                    System.out.println("correct");
                    score++;
                }
                else {
                    System.out.println("incorrect");
                }
            }
        System.out.println("your score is "+ score + " out of "+ questions.length);
        System.out.println();

            scan.close();
    }
}