public class EnhancedSwitches {
    public static void main(String[] args){

        // Enhanced switch = A replacement to many else if statements

        String day = "Sunday";

        switch (day){
            case "Monday" -> System.out.println("You have to work");
            case "Tuesday" -> System.out.println("You have to work");
            case "Wednesday" -> System.out.println("You have to work");
            case "Thursday" -> System.out.println("You have to work");
            case "Friday" -> System.out.println("You have to work");
            case "Saturday", "Sunday" -> System.out.println("You DONT have to work");
            default -> System.out.println(day + " is not a day");

        }

    }

}
