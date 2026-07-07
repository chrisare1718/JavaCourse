import java.util.Scanner;

public class Scanner_User {
    public static void main(String[] args){
        // Scanner is an object that allows the user to input data

        // We create an object to use the Scanner
        Scanner askData = new Scanner(System.in);

        // We make our first petition
        System.out.print("Enter your name: ");
        String name = askData.nextLine();

        System.out.print("Enter your age: ");
        int age = askData.nextInt();

        System.out.print("Enter your salary per month: ");
        double salary = askData.nextDouble();

        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = askData.nextBoolean();


        // Common issue, the "\n" is an EMPTY STRING so you have to do this

        System.out.print("How many games do you have: ");
        int gamesQuantity = askData.nextInt();
        askData.nextLine(); // THIS AVOID THE ISSUE

        System.out.print("Which is your favorite color? ");
        String color = askData.nextLine();


        // PRINT DATA
        System.out.println("Your name is: " + name);
        System.out.println("And you're " + age + " years old");
        System.out.println("He earns " + salary + " per month");

        if(isStudent){
            System.out.println("He's a student");
        } else {
            System.out.println("He is NOT a student");
        }

        System.out.println("You have " + gamesQuantity + " games");
        System.out.println("Your favorite color is: " + color);

        // Everytime we create an object, we closed at the end of the program
        askData.close();
    }
}
