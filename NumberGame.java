import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args){
        int randomNumber = (int) (Math.random()*100)+1;
        System.out.println("I have randomly choosen a number between 1 and 100");
        System.out.println("Try to guess it.");
        boolean result = false;
        Scanner scanner = new Scanner(System.in);
        for(int i =10;i>0;i--){
            System.out.println("Number of "+ i + " guess(es) left. Choose again");
            int guess = scanner.nextInt();
            //System.out.println("Your guess was:" +guess);
            if(randomNumber < guess){
                System.out.println("Number is smaller than" +guess);
            }
            if(randomNumber > guess){
                System.out.println("Number is greater than " +guess);
            }
            if(randomNumber == guess){
                result = true;
                break;
            }
        }
        if(result){
            System.out.println("You Win!");
        }
        else{
            System.out.println("You Lose. Play again");
            System.out.println("Number was " + randomNumber);
        }

    }
}
