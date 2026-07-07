public class VariablesExample {

    public static void main(String[] args){
        // Variable: contains a reusable value and the behavior depends about what and wich kind of value contains

        // Primitive: value stored on memory or Stack (Memory contains the data temporaly)
        /* int, double, char, boolean */

        // Reference: memory addres (stack) that points to the (heap) (I.O.U money which is in the bank)
        /* string, array, object */

        /* Declaration is put a data type and name to the variable */
        /* Assignment is giving a value to the vairable according to the data type */
        int age = 24;
        int year = 2026;

        double price = 18.15;
        double gpa = 3.5;

        char grade = 'C';
        char symbol = '&';

        boolean isStudent = true;

        String name = "Chris Arellano";


        System.out.println("The year is: " + year);
        System.out.println("The price of one dolar to mexican pesos is: $" + price);
        System.out.println("My grade is: " + grade);
        System.out.println("Is he an student? " + isStudent);
        System.out.println(name);
    }

}
