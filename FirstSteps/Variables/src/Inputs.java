import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        // We use a Scanner to allow the program accept the user inputs data.
        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scannerObject.nextLine();
        System.out.println("Hello " + name);

        System.out.print("How many consoles do you have? ");
        int consoleQuantity = scannerObject.nextInt();
        // We use this 'cause 'Enter' is the nextLine and won't allow us to write the next input
        scannerObject.nextLine();
        System.out.println("Thanks, now I know do you have " + consoleQuantity + " consoles");

        System.out.print("Which is your favorite food? ");
        String food = scannerObject.nextLine();
        System.out.println("Really? I love " + food + " too!");

        scannerObject.close();
    }

}
