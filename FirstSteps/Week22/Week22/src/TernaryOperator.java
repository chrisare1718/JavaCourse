public class TernaryOperator {
    public static void main(String[] args){
        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

        int number = 6;

        String evenOrOdd = ( number % 2 == 0 ) ? "EVEN" : "ODD" ;

        System.out.println(evenOrOdd);

    }

}
