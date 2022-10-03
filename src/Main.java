import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String choicePlayerA;
        String choicePlayerB;
        boolean replay = true;
        Scanner in = new Scanner(System.in);

        System.out.println("Choose either (P)aper, (R)ock, or (S)cissors, Player A.");
        choicePlayerA = in.nextLine();

        System.out.println("Choose either (P)aper, (R)ock, or (Scissors, Player B.");
        choicePlayerB = in.nextLine();

        if (choicePlayerA.equalsIgnoreCase("R")) {
            if (choicePlayerB.equalsIgnoreCase("R")) {
                System.out.println("R x R is a tie.");
            } else if (choicePlayerB.equalsIgnoreCase("P")) {
                System.out.println("Player B wins because Paper covers Rock.");
            } else {
                System.out.println("Player A wins because Rock beats scissors.");
            }
        } else if (choicePlayerA.equalsIgnoreCase("P")) {
            if (choicePlayerB.equalsIgnoreCase("P")) {
                System.out.println("P x P is a tie.");
            } else if (choicePlayerB.equalsIgnoreCase("S")) {
                System.out.println("Player B wins because Scissors cuts Paper.");
            } else {
                System.out.println("Player A wins because Paper covers Rock.");
            }
        }
        else if (choicePlayerA.equalsIgnoreCase("S"))
        {
            if (choicePlayerB.equalsIgnoreCase("S"))
            {
                System.out.println("S x S is a tie.");
            }
           else if (choicePlayerB.equalsIgnoreCase("R"))
           {
               System.out.println("Player B wins because Rock beats Scissors");
           }
           else
           {
               System.out.println("Player A wins because Scissors cuts Paper.");
           }
        }
        while (replay) {
            System.out.println("Do you want to play again? (y/n)");
            replay = in.nextLine().trim().equalsIgnoreCase("y");
        }
    }
}