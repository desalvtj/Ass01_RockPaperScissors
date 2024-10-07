import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean donePlayA = false;
        boolean donePlayB = false;
        boolean doneInput = false;
        boolean donePlaying = false;

        do {

            do {
                 System.out.print("Let's play a round of Rock, Paper, Scissors! Player A enter your move [R/P/S]: ");
                 playerA = in.nextLine();
                 if(playerA.equalsIgnoreCase("R"))
                 {donePlayA = true;}
                 else if(playerA.equalsIgnoreCase("P"))
                 {donePlayA = true;}
                 else if(playerA.equalsIgnoreCase("S"))
                 {donePlayA = true;}
                 else
                     System.out.println(playerA + " is an invalid move. Please pick R/P/S.");
                 }while(!donePlayA);

            do {
                System.out.print("Player B enter your move [R/P/S]: ");
                playerB = in.nextLine();
                if(playerB.equalsIgnoreCase("R"))
                {donePlayB = true;}
                else if(playerB.equalsIgnoreCase("P"))
                {donePlayB = true;}
                else if(playerB.equalsIgnoreCase("S"))
                {donePlayB = true;}
                else
                    System.out.println(playerB + " is an invalid move. Please pick R/P/S.");
               }while(!donePlayB);

            if (playerA.equalsIgnoreCase("R"))
                if (playerB.equalsIgnoreCase("R"))
                {System.out.println("Rock vs Rock! It's a TIE!");}
                else if (playerB.equalsIgnoreCase("P"))
                {System.out.println("Paper covers Rock! Player B WINS!");}
                else {System.out.println("Rock smashes Scissors! Player A WINS!");}

            else if (playerA.equalsIgnoreCase("P"))
                if (playerB.equalsIgnoreCase("R"))
                {System.out.println("Paper covers Rock! Player A WINS!");}
                else if (playerB.equalsIgnoreCase("P"))
                {System.out.println("Paper vs Paper! It's a TIE!");}
                else {System.out.println("Scissors cuts Paper! Player B WINS!");}

            else
                if (playerB.equalsIgnoreCase("R"))
                {System.out.println("Rock breaks Scissors! Player B WINS!");}
                else if (playerB.equalsIgnoreCase("P"))
                {System.out.println("Scissors cuts Paper! Player A WINS!");}
                else {System.out.println("Scissors vs Scissors! It's a TIE!");}

            do {
                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y")) {
                    doneInput = true;
                } else if (playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Thanks for playing!");
                    doneInput = true;
                    donePlaying = true;
                } else
                    System.out.println(playAgain + " is an invalid choice. Please pick Y/N.");

               }while(!doneInput);

           }while(!donePlaying);



    }
}