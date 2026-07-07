public class ternaryOperatorExercise {
    public static void main(String[] args){

        int age = 20;

        String status = (age >= 18) ? "Adult" : "Young";
        System.out.println("You're " + status);

        int a = 15;
        int b = 15;

        String maxNumber = (a > b) ? "a is larger " + a :
                        (a < b) ? "b is larger " + b :
                                "they're equal " + "a=" +  a + " b=" + b;
        System.out.println(maxNumber);


        int score = 99;

        String grade = (score >=90) ? "A":
                        (score >= 80) ? "B":
                                (score >=70) ? "C": "F";
        System.out.println(grade);
    }
}