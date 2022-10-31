import com.sun.org.apache.xalan.internal.xsltc.trax.SmartTransformerFactoryImpl;

import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            String[] rps = {"r", "p", "s"};
            String ComputerMove = rps[new Random().nextInt(rps.length)];

            String PlayerMove;
            while (true) {
                System.out.println("Your move:(r,p,s) ");
                PlayerMove = sc.nextLine();
                if (PlayerMove.equals("r") || PlayerMove.equals("s") || PlayerMove.equals("p")) {
                    break;

                }
                System.out.println(PlayerMove + "is not valid, guess again");
            }
            System.out.println("computer played  " + ComputerMove);
            if (PlayerMove.equals(ComputerMove)) {
                System.out.println("its a tie");
            } else if (PlayerMove.equals("r")) {
                if (ComputerMove.equals("p")) {
                    System.out.println("You lose");
                } else if (ComputerMove.equals("s")) {
                    System.out.println("You won");
                }
            } else if (PlayerMove.equals("p")) {
                if (ComputerMove.equals("r")) {
                    System.out.println("You won");
                } else if (ComputerMove.equals("s")) {
                    System.out.println("You lose");
                }
            } else if (PlayerMove.equals("s")) {
                if (ComputerMove.equals("r")) {
                    System.out.println("You lose");
                } else if (ComputerMove.equals("p")) {
                    System.out.println("You won");
                }
            }


            System.out.println("Play again? (y/n)");
            String playAgain = sc.nextLine();
            if (!playAgain.equals("y")) {
                break;


            }

          sc.close();


        }
    }
}


