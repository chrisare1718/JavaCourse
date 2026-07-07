import java.util.Scanner;
import java.util.Random;

public class areaFigures {
    public static void main(String[] args){
        Scanner areas = new Scanner(System.in);
        System.out.print("First tell me which figure you want to know the area: \n" +
                "1- Triangle \n" +
                "2- Rectangle \n" +
                "3- Circle \n" +
                "4- Square \n" +
                "Option: ");

        int pickFigure = areas.nextByte();

        if(pickFigure == 1){
            System.out.println("You choose triangle \n");

            System.out.print("Give me the base number: ");

            double baseNumber = areas.nextDouble();

            System.out.print("Now give me the height: ");

            double heightNumber = areas.nextDouble();

            double result = (baseNumber * heightNumber)/2;

            System.out.printf("The result is: %.2f", result);
        }
        else if(pickFigure == 2){
            System.out.println("You choose rectangle \n");

            System.out.print("Give me the base number: ");

            double baseNumber = areas.nextDouble();

            System.out.print("Now give me the height: ");

            double heightNumber = areas.nextDouble();

            double result = (baseNumber * heightNumber);

            System.out.printf("The result is: %.2f", result);
        }
        else if(pickFigure == 3){
            double radius = 0;
            double areaCircle = 0;

            System.out.println("You choose circle \n");
            areas.nextLine();

            System.out.print("Do you know the radius? y/n: ");
            char answer = areas.nextLine().toLowerCase().charAt(0);

            if(answer == 'y'){
                System.out.print("Give me the radius: ");
                radius = areas.nextDouble();
            }
            else if (answer == 'n'){
                System.out.println("Give me the diameter: ");

                double diameter = areas.nextDouble();
                radius = diameter/2;
            }

            areaCircle = Math.PI * Math.pow(radius, 2);

            System.out.printf("The area of the circle is: %.2f", areaCircle);
        }
        else if(pickFigure == 4){
            System.out.println("You choose square \n");
            areas.nextLine();

            System.out.println("In this case we're gonna pick a Random Number");

            Random sizeRandomNumber = new Random();

            double side = sizeRandomNumber.nextDouble(1, 500);

            double area = side * side;

            System.out.printf("The random number was: %.2f and the result is: %.2f", side, area);
        }
        else{
            System.out.println("Invalid option");
        }
        areas.close();
    }
}