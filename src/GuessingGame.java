import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class GuessingGame {

    private String playerName;
    private  int targetNumber;
    //generate a random num
    private int guessCount;
    private int playerGuess;


    public GuessingGame(){
        //greet player
        System.out.println("Welcome to the Guessing Game! Let's begin.");
        //get player name
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name");
        playerName = scan.nextLine();
        System.out.println("Hello, " + playerName + "! Let's begin the game.");

        //generate secret number
        Random randomNum=new Random();
        targetNumber= randomNum.nextInt(100)+1;

        //game loop
        do{
            System.out.println("Guess the num between 1 to 100");
            try {
            playerGuess=scan.nextInt();
            if(playerGuess<1 || playerGuess>100){
                System.out.println("Invalid input. Number must be between 1 and 100.");
            }else{
                guessCount++;
            }

            if(playerGuess>targetNumber){
                System.out.println("Too high! Guess again.");
            }else if(playerGuess<targetNumber){
                System.out.println("Too low! Guess again.");
            }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next();
            }

        }while(playerGuess!=targetNumber);
        //game over
        System.out.println("Congratulations, "+ playerName+ "! You guessed the number in "+ guessCount+ " tries.");

    }

}
