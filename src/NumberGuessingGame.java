import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int count =0;
        while (true) {
            System.out.print("ENTER NUMBER : ");
            int input_number = sc.nextInt();
            count++;

            if (input_number == number) {
                System.out.println("\uD83C\uDF89 YOU WIN! Correct Guess!!!");
                break;
            } else if (input_number > number) {
                System.out.println("TOO HIGH !!");
            } else if (input_number < number) {
                System.out.println("TOO LOW !!");
            }
        }
        System.out.println("Attempts : "+count);
    }
}
