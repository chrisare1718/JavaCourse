public class Methods {
    public static void main(String[] args){
        // Method = block of reusable code that is executed when is called()

        // if the main Method or a method where you're calling another method is static
        // You should put the method you're gonna call, static as well

        /*
        String name = "John";
        int age = 25;
        happyBirthday(name, age);
        */

        int ageBoolean = 22;

        if(ageCheck(ageBoolean)){
            System.out.println("You're an adult");
        }
        else{
            System.out.println("You're a minor, GET OUT!");
        }

        System.out.println(square(3));

        String fullName = getFullName("Christian",  "Arellano");
        System.out.println(fullName);

        // A parameters are the variables that are required for the method to work, sometimes to initialize something

        // The arguments are the values you use on the called method in the Main
        // In both cases the order you put the data on the arguments has to be the sames as the parameters
        // That includes the data type, must be equals
    }

    static void happyBirthday(String birthdayBoi, int birthdayAge){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s! \n", birthdayBoi);
        System.out.printf("You're %d years old \n", birthdayAge);
        System.out.println("Happy Birthday to you! \n");
    }

    // Method that return a specific value
    static double square(double number){

        return number * number;
    }

    static String getFullName(String first, String last){
        return  first + " " + last;
    }

    static boolean ageCheck(int age){
        return age >= 18;
    }
}