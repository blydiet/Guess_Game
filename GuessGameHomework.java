import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import static java.lang.Math.*;
import java.util.*;

public class GuessGameHomework {
    public static void main(String[] args) {
      
      ArrayList<Integer> myList = new ArrayList<Integer>();
        /*
        if (args.length != 2) {
            System.out.println("Usage: java GuessGame MAX_INT MAX_GUESS");
            return;
        }
        */

        // This is how you convert a string to an integer:
        int maxInteger; // Integer.parseInt(args[0]);
        int Validity = 0;
        //int array[
        // This is the number of guesses the user gets.
        int limit = 4; // Integer.parseInt(args[1]);
        // This creates a new random number generator
        Random rand = new Random();
        System.out.printf("Maximum Number Equals To....."); 
        Scanner input = new Scanner(System.in);
        try{
        maxInteger = input.nextInt();
        int target = rand.nextInt(maxInteger);
        while(Validity == 1);
        { 
         try{ 
        System.out.printf("Guess a number between 1 and %d.\n", maxInteger);

        // Loop while the number of attempts is less than the number of allowed guesses
        int attempts = 0;
        while (attempts <= limit) {
            System.out.printf("Attempt %d of %d: ", attempts, limit);

            // This is how you get an integer from stdin.
            // (This is like `int guess << cin` in C++.)
            int guess = input.nextInt();
            Validity(myList, guess); 
            System.out.printf("You guessed %d\n", guess);

            // TODO:  Your code goes here!
            // This should take you about 10 lines of code.
            if(guess > maxInteger || guess < 1 )
            {
               System.out.printf ("Number is out of bounds, Guess Again\n"); 
            }
              
            else if(guess > target) 
            { 
               System.out.printf("Too High! \n");
            }
            else if(guess < target)
            {  
               System.out.printf("Too low \n");
            }
            else
            {
              System.out.printf("YOU WIN! \n");
              System.exit(0); 
            }
            attempts+=1;
        }
        System.out.println("You lose!");
        System.exit(0);
        }
        catch(Exception e){  
            System.out.println("NOT A NUMBER!TRY AGAIN");
         }
        }
        }finally{
        input.close();
        }
    }

public static boolean Validity(List myList, int num) {
        if (myList.contains(num)) {
            System.out.println("You Previously Guessed This Number, Guess Again");
            return false;
        } else {
            myList.add(num);
        }
        return true;
    }
}