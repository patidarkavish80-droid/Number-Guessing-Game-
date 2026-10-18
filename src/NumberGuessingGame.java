import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);

    static void medium() {
        int count = 0;
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("\uD83C\uDFAE Difficulty: MEDIUM\n" +
                "Guess a number between 1 and 100\n" +
                "Maximum attempts: 7");
        System.out.println();
        System.out.println();
        while (true) {
            System.out.print("ENTER NUMBER : ");
            int input_number = sc.nextInt();
            if (input_number < 1 || input_number > 100) {
                System.out.println("Enter a number between 1 and 100");
                continue;
            }
            count++;
            if (input_number == number) {
                System.out.println("\uD83C\uDF89 YOU WIN! Correct Guess!!!");
                break;
            } else if (input_number > number) {
                System.out.println("TOO HIGH !!");
            } else if (input_number < number) {
                System.out.println("TOO LOW !!");
            }

            System.out.println("Attempts : " + count);
            if (count >= 7) {
                System.out.println();
                System.out.println("❌ GAME OVER!\n" +
                        "The secret number was " + number);
                break;
            }
        }
    }

    static void easy() {
        int count = 0;
        Random random = new Random();
        int number = random.nextInt(50) + 1;
        System.out.println("\uD83C\uDFAE Difficulty: EASY\n" +
                "Guess a number between 1 and 50\n" +
                "Maximum attempts: 10");
        System.out.println();
        System.out.println();
        while (true) {
            System.out.print("ENTER NUMBER : ");
            int input_number = sc.nextInt();
            if (input_number < 1 || input_number > 50) {
                System.out.println("Enter a number between 1 and 50");
                continue;
            }
            count++;
            if (input_number == number) {
                System.out.println("\uD83C\uDF89 YOU WIN! Correct Guess!!!");
                break;
            } else if (input_number > number) {
                System.out.println("TOO HIGH !!");
            } else if (input_number < number) {
                System.out.println("TOO LOW !!");
            }

            System.out.println("Attempts : " + count);
            if (count >= 10) {
                System.out.println();
                System.out.println("❌ GAME OVER!\n" +
                        "The secret number was " + number);
                break;
            }
        }
    }

    static void hard() {
        int count = 0;
        Random random = new Random();
        int number = random.nextInt(500) + 1;
        System.out.println("\uD83C\uDFAE Difficulty: HARD\n" +
                "Guess a number between 1 and 500\n" +
                "Maximum attempts: 8");
        System.out.println();
        System.out.println();
        while (true) {
            System.out.print("ENTER NUMBER : ");
            int input_number = sc.nextInt();
            if (input_number < 1 || input_number > 500) {
                System.out.println("Enter a number between 1 and 500");
                continue;
            }
            count++;
            if (input_number == number) {
                System.out.println("\uD83C\uDF89 YOU WIN! Correct Guess!!!");
                break;
            } else if (input_number > number) {
                System.out.println("TOO HIGH !!");
            } else if (input_number < number) {
                System.out.println("TOO LOW !!");
            }

            System.out.println("Attempts : " + count);
            if (count >= 8) {
                System.out.println();
                System.out.println("❌ GAME OVER!\n" +
                        "The secret number was " + number);
                break;
            }
        }
    }


    public static void main(String[] args) {
        int playagain;
        do {
            System.out.println("CHOOSE DIFFICULTY : ");
            System.out.println("1. EASY ");
            System.out.println("2. MEDIUM");
            System.out.println("3. HARD");
            System.out.println();
            System.out.print("ENTER CHOICE : ");
            int choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    easy();
                    break;
                case 2:
                    medium();
                    break;
                case 3:
                    hard();
                    break;
                default:
                    System.out.println("Invalid choice !!");

            }
            System.out.println();
            System.out.println("Play_Again");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.print("enter choice : ");
            playagain = sc.nextInt();

        } while (playagain == 1);
        System.out.println("Thanks for playing!");
    }
}

