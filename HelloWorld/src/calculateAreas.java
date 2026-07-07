import  java.util.Scanner;
public class calculateAreas {
    public static void main(String[] args){
        // We're gonna calculate a rectangle area

        // Initialize the variables
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner objectValues = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        width = objectValues.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        height = objectValues.nextDouble();

        area = width * height;

        System.out.println("The total area of the rectangle is: " + area + " cm^2");

        objectValues.close();
    }
}