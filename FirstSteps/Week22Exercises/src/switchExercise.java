import java.util.Random;
import java.util.Scanner;

public class switchExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me your grade: ");

        char grade = scanner.nextLine().toUpperCase().charAt(0);

        switch (grade){
            case 'A'  -> System.out.println("Excellent");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Could be better");
            case 'D', 'E', 'F' -> System.out.println("Fail");
            default -> System.out.println("Not a valid option");
        }

        int menuOption;

        do{
            System.out.print("Now pick an option: \n"
                    + "1) Know if you can get an ID \n"
                    + "2) Guessing game  \n"
                    + "3) Print 1 to 50 \n"
                    + "4) Skip Multiples of 5 on loop 1 to 20 \n"
                    + "5) Exit \n"
                    + "Option: ");

            menuOption = scanner.nextInt();

            switch (menuOption){
                case 1:
                    System.out.print("Give me your age: ");
                    int age = scanner.nextInt();

                    String idCard = (age>=18) ? "You can have an ID" : "You're too young for that";

                    System.out.printf("Ok: %s", idCard);

                    break;
                case 2:
                    Random random = new Random();

                    int guess;
                    int attempts = 0;
                    int min = 1;
                    int max = 100;
                    int randomNumber = random.nextInt(min,max + 1);

                    System.out.printf("Guess a number between %d - %d \n", min, max);

                    do{
                        System.out.print("Enter a guess: ");
                        guess = scanner.nextInt();
                        attempts ++;

                        if(guess < randomNumber){
                            System.out.println("TOO LOW");
                        }
                        else if(guess > randomNumber){
                            System.out.println("TOO HIGH");
                        }
                        else{
                            System.out.println("CORRECT! The number was: " + randomNumber);
                            System.out.println("# of attempts: " + attempts);
                        }
                    }while(guess != randomNumber);
                    break;
                case 3:
                    for(int i =1; i<=50; i++){
                        System.out.println(i);
                    }
                    System.out.println("DONE");
                    break;
                case 4:
                    for(int i =1; i<=20; i++){
                        // Here skips multiples of 5 because the remainder is 0
                        if (i % 5 == 0) {
                            continue;
                        }
                        System.out.println(i);
                    }
                    System.out.println("DONE");
                    break;
                case 5:
                    System.out.println("Thanks for play");
                    break;
                default:
                    System.out.println("Not a valid option");
            }
        }while(menuOption != 5);
        scanner.close();
    }
}