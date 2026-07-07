public class MathClass {
    public static void main(String[] args){
        System.out.println(Math.PI);

        double result;

        result = Math.pow(2,3);
        result = Math.abs(-5); // Convert negative number to positive
        result = Math.sqrt(9);
        result = Math.round(2.54); // Makes a double to int
        result = Math.ceil(4.22); // Makes a number to the next one (equals 5)
        result = Math.floor(15.87); // Makes a number to below one (equals 15)
        result = Math.max(10,20);
        result = Math.min(10,20);

        System.out.println(result);

    }
}
