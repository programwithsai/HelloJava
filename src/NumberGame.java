import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public void guessTheNumber() {
        Random random = new Random();

        int number = random.nextInt(21);

        Scanner input = new Scanner(System.in);

        int guess;
        do {
            System.out.println("Guess a number between 0 and 20: ");

            try {
                guess = input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Only numbers please!");
                return;
            }

            if (number == guess) {
                System.out.println("Hey! you guessed it right!");
            } else if (number < guess){
                System.out.println("Sorry! you guessed it wrong!" +
                        " Hint: guess a lower number");
            } else {
                System.out.println("Sorry! you guessed it wrong!" +
                        " Hint: guess a higher number");
            }
        } while (number != guess);
    }

    public static void main(String[] args) {
        NumberGame game = new NumberGame();


        game.guessTheNumber();
    }
}






