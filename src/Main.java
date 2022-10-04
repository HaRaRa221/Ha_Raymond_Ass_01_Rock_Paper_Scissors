import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String choicePlayerA;
        String choicePlayerB;
        boolean rePlay = true;
        String gameContinue;

        Scanner in = new Scanner(System.in);


        do {
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
        } else if (choicePlayerA.equalsIgnoreCase("S")) {
            if (choicePlayerB.equalsIgnoreCase("S")) {
                System.out.println("S x S is a tie.");
            } else if (choicePlayerB.equalsIgnoreCase("R")) {
                System.out.println("Player B wins because Rock beats Scissors");
            } else {
                System.out.println("Player A wins because Scissors cuts Paper.");
            }
        } else {
            System.out.println("You should only input (R)ock, (P)aper, or (S)cissors.");
            rePlay = true;
            rePlay = false;
        }
            System.out.println("Want to play this game again? [Y/N]");
            gameContinue = in.nextLine();
            if (gameContinue.equalsIgnoreCase("Y")) {
                continue;
            }
            else if (gameContinue.equalsIgnoreCase("N")) {
                System.out.println("We appreciate your time. Come and play again!");
                System.exit(0);
            }
        }
        while (rePlay == true);
    }
}