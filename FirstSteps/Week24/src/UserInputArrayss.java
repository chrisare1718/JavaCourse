import java.util.Scanner;

public class UserInputArrayss {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Declare an Array with specific quantity of elements
        String[] foods = new String[3];

        /* Here the user out the number of elements for the array */
        String[] subjects;

        int numSubjects;

        System.out.print("How many subjects you're gonna have this semester? ");
        numSubjects = scanner.nextInt();
        scanner.nextLine();

        subjects = new  String[numSubjects];

        /* **********  */
        for(int i = 0; i < subjects.length; i++){
            System.out.print("Enter the subjects: ");
            subjects[i] = scanner.nextLine();
        }

        for(String subject : subjects){
            System.out.println(subject);
        }


        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();

    }

}
