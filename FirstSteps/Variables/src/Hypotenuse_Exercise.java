import java.util.Scanner;

public class Hypotenuse_Exercise {
    public static void main(String[] args){

        Scanner objectSqrt = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("We're gonna calculate the hypotenuse");
        System.out.print("Put the first value: ");
        a = objectSqrt.nextDouble();

        System.out.print("Put the second value: ");
        b = objectSqrt.nextDouble();

        System.out.println("The numbers you put were: " + a + " & " + b);

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse value is: " + c);


        objectSqrt.close();
    }
}
