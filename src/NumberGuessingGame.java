import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int RandomNumber = rand.nextInt(100) + 1;
        //System.out.println(RandomNumber);
        int count = 0;


        while (true)
        {
            System.out.println("Enter your number:");

            Scanner sc = new Scanner(System.in);
            int YourNumber = sc.nextInt();
            count++;

              if (YourNumber == RandomNumber)
              {
                System.out.println(" You guessed it right!!");
                  System.out.println(" it took you " + count+ " number of tries");
                break;

              }

              else if (YourNumber > RandomNumber)
               {
                System.out.println(" Guess a lower number");
               }

              else
              {
                System.out.println(" Guess a highher number");
               }
        }



    }
}
