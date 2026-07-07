import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args){
        // array = collection of values of the same data type
        // is like a variable that can store more tham 1 value

        // Declare an Array
        String[] fruits = {"apple", "orange", "banana", "peach"};

        System.out.println(fruits[2]);

        // Know quantity of elements
        int numFruits = fruits.length;

        System.out.println(numFruits);

        // To print all the array, we use a for loop
        for(int i=0; i<numFruits; i++){
            System.out.print(fruits[i] + " ");
        }

        // To simply an iteration from a collection we use an enhanced loop
        // It's another way to call foreach, just works to walk through elements
        // Without indexes

        // To Sort array
        Arrays.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }

}
