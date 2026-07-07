import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args){

        Random random = new Random();

        /* We're gonna use a dice of 3 faces as example */
        int number1;
        int number2;
        int number3;


        // The last number of the random, is exclusive
        number1 = random.nextInt(1,100);
        number2 = random.nextInt(1,100);
        number3 = random.nextInt(1,100);


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


    }

}
