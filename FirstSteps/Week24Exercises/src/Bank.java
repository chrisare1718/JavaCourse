import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){

        /* STEPS */

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            // DISPLAY MENU
            System.out.println("***** BANKING PROGRAM *****");
            System.out.println("1.- Show Balance");
            System.out.println("2.- Deposit");
            System.out.println("3.- Withdraw");
            System.out.println("4.- Exit");

            // GET AND PROCESS USERS CHOICE
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        // EXIT MESSAGE
        System.out.println("***** THANK YOU, HAVE A NICE DAY! *****");


        scanner.close();
    }

    // showBalance()
    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }

    // deposit()
    static double deposit(){

        double amount;

        System.out.print("Enter an amount to be deposited: ");

        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    // withdraw()
    static double withdraw(double balance){

        double amount;

        System.out.print("Enter an amount to be withdrawn: ");

        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
