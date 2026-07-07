import java.util.Scanner;

public class Addition {
    public static void main(String[] args){

        int firstNumber = 0;
        int secondNumber = 0;
        double average = 0;

        Scanner numbers = new Scanner(System.in);

        System.out.print("Give me a first number: ");
        firstNumber = numbers.nextInt();

        System.out.print("Give me the second number: ");
        secondNumber = numbers.nextInt();
        numbers.nextLine();

        System.out.print("What is your name? ");
        String name = numbers.nextLine();

        average = (firstNumber + secondNumber) / (double)2;

        // Print Data
        System.out.println("Your avarage is: " + average );

        System.out.println("Your name is: " + name);
    }
}
