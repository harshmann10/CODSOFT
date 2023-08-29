import java.util.Random;
import java.util.Scanner;

public class codsoft_NUMBER_GAME {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int maxAttempt = 10;
        int rounds = 0;
        int score = 0;
        boolean ans = true;
        String play = "y";
        System.out.println("Welcome to the Number Guessing Game");
        while (play.equals("y")) {
            int num = random.nextInt(100) + 1;
            int attempt = 0;
            rounds ++;
            System.out.println("Round " + rounds);
            System.out.println("I have selected a random number between 1 and 100");
            System.out.println("Enter your guess: ");
            while (ans) {
                int user = input.nextInt();
                if (num == user) {
                    System.out.println("your guess is correct in " + attempt + " attempts");
                    score++;
                    ans = false;
                    break;
                }
                if (num < user) {
                    System.out.println("your guess too high");
                    attempt++;
                } else if (num > user) {
                    System.out.println("your guess too low");
                    attempt++;
                }
                if (attempt < maxAttempt) {
                    System.out.println("You have " + (maxAttempt - attempt) + " attempts remaining");
                } else {
                    System.out.println("You've run out of attempts, The correct number was " + num);
                    ans = false;
                }
            }
            System.out.println("do you want to play again? (y/n)");
            play = input.next();
            ans = true;
        }
        System.out.println("Game over! Your total score is " + score + " points");
    }
}
