public class VarArgss {
    public static void main(String[] args){
        // vargs = allow a method to accept a varying # of arguments
        // makes methods more flexibles, no need for overload methods
        // because doesn't deppend # of arguments and parameters
        // java will pack the arguments into an array

        System.out.println(average(5,7,10,27));

    }
    static double average(double... numbers){

        double sum= 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;
    }
}
