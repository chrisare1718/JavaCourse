import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {5, 3, 7, 2, 9};

        int target = 1;
        boolean isFound = false;

        String[] fruits = {"apple", "pineapple", "orange", "cherry"};
        String targetFruit = "apple";


        String[] pets = {"dog", "cat", "bird", "fish"};
        String targetPet;

        System.out.print("Enter the kind of pet are you looking for: ");
        targetPet = scanner.nextLine();


        // Look for a number
        /*
        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                System.out.print("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.print("Element not found in the array");
        }
        */

        // Look for a string
        /*
        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(targetFruit)){
                System.out.print("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.print("Element not found in the array");
        }
        */

        // Look for a pet
        for(int i = 0; i < pets.length; i++){
            if(pets[i].equals(targetPet)){
                System.out.print("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.print("Element not found in the array");
        }

        scanner.close();
    }
}
